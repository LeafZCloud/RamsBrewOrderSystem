package edu.farmingdale.RamsBrewOrderSystem.Factories;

import edu.farmingdale.RamsBrewOrderSystem.Drinks.*;

public class IcedDrinksFactory implements DrinksFactory {

    @Override
    public Drinks createCoffee() {
        return new Coffee("Iced");
    }

    @Override
    public Drinks createLatte() {
        return new Latte("Iced");
    }

    @Override
    public Drinks createCappuccino() {
        return new Cappuccino("Iced");
    }

    @Override
    public Drinks createTea() {
        return new Tea("Iced");
    }
}