package edu.farmingdale.RamsBrewOrderSystem.Drinks;

// Cappuccino drink class
public class Cappuccino extends Drinks {

    public Cappuccino(String temperature) {
        super(temperature);
    }

    // Returns the drink type
    @Override
    public String getDrinkType() {
        return "Cappuccino";
    }
}