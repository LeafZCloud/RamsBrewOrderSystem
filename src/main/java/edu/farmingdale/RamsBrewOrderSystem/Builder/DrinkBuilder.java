package edu.farmingdale.RamsBrewOrderSystem.Builder;

import edu.farmingdale.RamsBrewOrderSystem.Drinks.Drinks;

public class DrinkBuilder {
    private Drinks drink;

    public DrinkBuilder(Drinks drink) {
        this.drink = drink;
    }

    public DrinkBuilder setSize(String size) {
        switch (size) {
            case "Small":
            case "Medium":
            case "Large":
                drink.setSize(size);
                break;
        }
        return this;
    }

    public DrinkBuilder setMilk(String milk) {
        switch (milk) {
            case "Whole":
            case "Skim":
            case "Almond":
            case "Oat":
            case "Soy":
            case "None":
                drink.setMilk(milk);
                break;
        }
        return this;
    }

    public DrinkBuilder setShots(int shots) {
        switch (shots) {
            case 1:
            case 2:
            case 3:
                drink.setShots(shots);
                break;
        }
        return this;
    }

    public DrinkBuilder setSweetener(String sweetener) {
        switch (sweetener) {
            case "Sugar":
            case "Honey":
            case "Stevia":
            case "None":
                drink.setSweetener(sweetener);
                break;
        }
        return this;
    }

    public Drinks build() {
        return drink;
    }
}