package Restraunt;

import Application.Application;
import Restraunt.Meal.Meal;

import java.util.ArrayList;
public class Restaurant {
    private String name;
    private String address;
    private ArrayList<Meal> meals =new ArrayList<>();
    private double discount;

    public Restaurant(String name, String address, double donation_balance) {
        this.name = name;
        this.address = address;
        this.discount=0;
    }
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public void addMeal(Meal meal){
        this.meals.add(meal);
    }
    public void addMeals (ArrayList<Meal>meals){
        this.meals.addAll(meals);
    }
    
    public double DonateMeals(double balance) {
        double remainingBalance = balance;
        System.out.println("\n=== Starting Donation Process ===");
        System.out.println("Initial balance: $\" + balance);\n" +
                "        System.out.println(\"\\nDonating meals from " + this.name + ":");

        // Track total meals donated
        int totalMealsDonated = 0;
        double totalValueDonated = 0.0;

        // Iterate through all meals
        for (Meal meal : meals) {
            if (remainingBalance <= 0) break;

            System.out.println("\nChecking meal: " + meal.getName());
            System.out.println("Price per meal: $" + meal.getPrice());
            System.out.println("Available quantity: " + meal.getQuantity());

            // Calculate how many meals we can afford with remaining balance
            int affordableQuantity = (int) (remainingBalance / meal.getPrice());
            System.out.println("Can afford: " + affordableQuantity + " meals with remaining balance");

            // Check how many meals are available
            int availableQuantity = meal.getQuantity();

            // Determine how many meals we can actually donate
            int mealsToReduce = Math.min(affordableQuantity, availableQuantity);

            if (mealsToReduce > 0) {
                // Update the meal quantity
                meal.setQuantity(availableQuantity - mealsToReduce);

                // Calculate cost of these meals
                double costOfDonation = (mealsToReduce * meal.getPrice())-(mealsToReduce * meal.getPrice()*discount);

                // Update the remaining balance
                remainingBalance -= costOfDonation;

                // Update tracking variables
                totalMealsDonated += mealsToReduce;
                totalValueDonated += costOfDonation;

                System.out.println("→ Donating " + mealsToReduce + " " + meal.getName() + "(s)");
                System.out.println("→ Cost of donation: $" + String.format("%.2f", costOfDonation));
                System.out.println("→ New quantity remaining: " + meal.getQuantity());
                System.out.println("→ Remaining balance: $" + String.format("%.2f", remainingBalance));
            } else {
                System.out.println("Cannot donate any of this meal (either too expensive or none available)");
            }
        }

        System.out.println("\n=== Donation Summary ===");
        System.out.println("Total meals donated: " + totalMealsDonated);
        System.out.println("Total value donated: $" + String.format("%.2f", totalValueDonated));
        System.out.println("Remaining balance: $" + String.format("%.2f", remainingBalance));
        System.out.println("========================\n");

        return remainingBalance;
    }
    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
