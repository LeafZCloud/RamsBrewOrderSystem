package edu.farmingdale.RamsBrewOrderSystem.Drinks;

// Abstract parent class for all drinks
public abstract class Drinks {

    // Fields for all Drinks (Options)
    protected String temperature;
    protected String size;
    protected String milk;
    protected int shots;
    protected String sweetener;

    // Constructor sets up the main drink temperature
    public Drinks(String temperature) {
        this.temperature = temperature;
        this.size = "Small";
        this.milk = "Whole";
        this.shots = 1;
        this.sweetener = "None";
    }


    // Subclasses will return its own drink type
    public abstract String getDrinkType();

    public boolean supportsShots() {
        return false;
    }


    // Getter for temperature
    public String getTemperature() {
        return temperature;
    }


    // Getter for size
    public String getSize() {
        return size;
    }

    // Setter for size
    public void setSize(String size) {
        this.size = size;
    }


    // Getter for milk
    public String getMilk() {
        return milk;
    }

    // Setter for milk
    public void setMilk(String milk) {
        this.milk = milk;
    }


    // Getter for # of shots
    public int getShots() {
        return shots;
    }

    // Setter for # of shots
    public void setShots(int shots) {
        this.shots = shots;
    }


    // Getter for sweetener
    public String getSweetener() {
        return sweetener;
    }

    // Setter for sweetener
    public void setSweetener(String sweetener) {
        this.sweetener = sweetener;
    }


    // Returns description of the drink
    public String getDescription() {
        StringBuilder description = new StringBuilder();
        description.append(temperature)
                .append(" ")
                .append(size)
                .append(" ")
                .append(getDrinkType())
                .append(" | Milk: ")
                .append(milk)
                .append(" | Sweetener: ")
                .append(sweetener);

        if (supportsShots()) {
            description.append(" | Shots: ").append(shots);
        }

        return description.toString();
    }
}
