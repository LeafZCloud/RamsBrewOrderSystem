package edu.farmingdale.RamsBrewOrderSystem;

import edu.farmingdale.RamsBrewOrderSystem.Drinks.Drinks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Order {
    private static int nextOrderNumber = 1001;

    private final int orderNumber;
    private final List<Drinks> drinks;
    private String serviceType;

    public Order(String serviceType) {
        this.orderNumber = nextOrderNumber++;
        this.drinks = new ArrayList<>();
        setServiceType(serviceType);
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public String getServiceType() {
        return serviceType;
    }

    public final void setServiceType(String serviceType) {
        switch (serviceType) {
            case "Dine-In":
            case "Takeout":
            case "Mobile Pickup":
                this.serviceType = serviceType;
                break;
            default:
                this.serviceType = "Takeout";
        }
    }

    public void addDrink(Drinks drink) {
        if (drink != null) {
            drinks.add(drink);
        }
    }

    public List<Drinks> getDrinks() {
        return Collections.unmodifiableList(drinks);
    }

    public String getOrderSummary() {
        StringBuilder summary = new StringBuilder();
        summary.append("Order #")
                .append(orderNumber)
                .append(" | Service Type: ")
                .append(serviceType)
                .append(System.lineSeparator());

        for (int i = 0; i < drinks.size(); i++) {
            summary.append(i + 1)
                    .append(". ")
                    .append(drinks.get(i).getDescription())
                    .append(System.lineSeparator());
        }

        summary.append("Total Drinks: ").append(drinks.size());
        return summary.toString();
    }

    @Override
    public String toString() {
        return getOrderSummary();
    }
}
