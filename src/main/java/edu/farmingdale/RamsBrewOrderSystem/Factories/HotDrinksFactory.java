package edu.farmingdale.RamsBrewOrderSystem.Factories;

import edu.farmingdale.RamsBrewOrderSystem.Drinks.*;

public class HotDrinksFactory implements DrinksFactory {

    @Override
    public Drinks createCoffee() {
        return new Coffee("Hot");
    }

    @Override
    public Drinks createLatte() {
        return new Latte("Hot");
    }

    @Override
    public Drinks createCappuccino() {
        return new Cappuccino("Hot");
    }

    @Override
    public Drinks createTea() {
        return new Tea("Hot");
    }
}