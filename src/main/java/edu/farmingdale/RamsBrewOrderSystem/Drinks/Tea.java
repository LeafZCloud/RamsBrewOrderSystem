package edu.farmingdale.RamsBrewOrderSystem.Drinks;

// Tea drink class
public class Tea extends Drinks {

    public Tea(String temperature) {
        super(temperature);
    }

    // Returns the drink type
    @Override
    public String getDrinkType() {
        return "Tea";
    }
}