package edu.farmingdale.RamsBrewOrderSystem.Drinks;

// Coffee drink class
public class Coffee extends Drinks {

    public Coffee(String temperature) {
        super(temperature);
    }

    // Returns the drink type
    @Override
    public String getDrinkType() {
        return "Coffee";
    }
}