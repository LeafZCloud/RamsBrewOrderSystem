package edu.farmingdale.RamsBrewOrderSystem;

import edu.farmingdale.RamsBrewOrderSystem.Builder.DrinkBuilder;
import edu.farmingdale.RamsBrewOrderSystem.Drinks.Drinks;
import edu.farmingdale.RamsBrewOrderSystem.Factories.DrinksFactory;
import edu.farmingdale.RamsBrewOrderSystem.Factories.HotDrinksFactory;
import edu.farmingdale.RamsBrewOrderSystem.Factories.IcedDrinksFactory;

import java.util.Scanner;

public class OrderDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ram's Brew Order System");
        System.out.println("-----------------------");

        String serviceType = promptForChoice(scanner,
                "Choose a service type:",
                new String[]{"Dine-In", "Takeout", "Mobile Pickup"});

        Order order = new Order(serviceType);

        boolean addAnotherDrink = true;
        while (addAnotherDrink) {
            Drinks drink = buildDrinkFromUserInput(scanner);
            order.addDrink(drink);

            String anotherDrink = promptForChoice(scanner,
                    "Would you like to add another drink?",
                    new String[]{"Yes", "No"});
            addAnotherDrink = anotherDrink.equals("Yes");
        }

        System.out.println();
        System.out.println("Order Summary");
        System.out.println("-------------");
        System.out.println(order);
    }

    private static Drinks buildDrinkFromUserInput(Scanner scanner) {
        String temperature = promptForChoice(scanner,
                "Choose a drink temperature:",
                new String[]{"Hot", "Iced"});

        DrinksFactory factory;
        switch (temperature) {
            case "Iced":
                factory = new IcedDrinksFactory();
                break;
            case "Hot":
            default:
                factory = new HotDrinksFactory();
                break;
        }

        String drinkType = promptForChoice(scanner,
                "Choose a drink type:",
                new String[]{"Coffee", "Latte", "Cappuccino", "Tea"});

        Drinks drink;
        switch (drinkType) {
            case "Latte":
                drink = factory.createLatte();
                break;
            case "Cappuccino":
                drink = factory.createCappuccino();
                break;
            case "Tea":
                drink = factory.createTea();
                break;
            case "Coffee":
            default:
                drink = factory.createCoffee();
                break;
        }

        DrinkBuilder builder = new DrinkBuilder(drink)
                .setSize(promptForChoice(scanner,
                        "Choose a size:",
                        new String[]{"Small", "Medium", "Large"}))
                .setMilk(promptForChoice(scanner,
                        "Choose a milk option:",
                        new String[]{"Whole", "Skim", "Almond", "Oat", "Soy", "None"}))
                .setSweetener(promptForChoice(scanner,
                        "Choose a sweetener:",
                        new String[]{"Sugar", "Honey", "Stevia", "None"}));

        if (drink.supportsShots()) {
            int shots = promptForNumber(scanner,
                    "Choose number of shots (1-3):",
                    1,
                    3);
            builder.setShots(shots);
        }

        return builder.build();
    }

    private static String promptForChoice(Scanner scanner, String prompt, String[] options) {
        while (true) {
            System.out.println();
            System.out.println(prompt);
            for (int i = 0; i < options.length; i++) {
                System.out.println((i + 1) + ". " + options[i]);
            }
            System.out.print("Enter choice: ");

            String input = scanner.nextLine().trim();

            try {
                int choice = Integer.parseInt(input);
                if (choice >= 1 && choice <= options.length) {
                    return options[choice - 1];
                }
            } catch (NumberFormatException ignored) {
            }

            System.out.println("Invalid choice. Please try again.");
        }
    }

    private static int promptForNumber(Scanner scanner, String prompt, int min, int max) {
        while (true) {
            System.out.println();
            System.out.print(prompt + " ");
            String input = scanner.nextLine().trim();

            try {
                int number = Integer.parseInt(input);
                if (number >= min && number <= max) {
                    return number;
                }
            } catch (NumberFormatException ignored) {
            }

            System.out.println("Invalid number. Please try again.");
        }
    }
}
