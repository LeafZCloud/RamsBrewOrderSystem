package edu.farmingdale.RamsBrewOrderSystem.Drinks;

// Latte drink class
public class Latte extends Drinks {

    public Latte(String temperature) {
        super(temperature);
    }

    // Returns the drink type
    @Override
    public String getDrinkType() {
        return "Latte";
    }
}