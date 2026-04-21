package edu.farmingdale.RamsBrewOrderSystem.Factories;

import edu.farmingdale.RamsBrewOrderSystem.Drinks.*;

// Abstract Factory interface that tells the drinks classes which drinks to create
public interface DrinksFactory {

    Drinks createCoffee();

    Drinks createLatte();

    Drinks createCappuccino();

    Drinks createTea();
}