package Application;

import Restraunt.DonatedMeal;
import Restraunt.DonationResult;
import Restraunt.Meal.Meal;
import Restraunt.Restaurant;
import java.util.ArrayList;

public class Application {
    final private String name = "Food Donation Application";
    private double balance = 0;
    private ArrayList<DonatedMeal> donatedMeals = new ArrayList<>();
    private ArrayList<Restaurant> allRestaurants = new ArrayList<>();

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void increaseBalance(double balance) {
        this.balance += balance;
    }


    public void donateToRestaurant(double balance, Restaurant restaurant) {
        if (this.balance >= balance) {
            this.balance -= balance;
            DonationResult result = restaurant.DonateMeals(balance);
            this.balance += result.getRemainingBalance();

            // Update donatedMeals tracking
            for (DonatedMeal newMeal : result.getDonatedMeals()) {
                boolean found = false;
                for (DonatedMeal existingMeal : donatedMeals) {
                    if (existingMeal.getName().equals(newMeal.getName())) {
                        existingMeal.setQuantity(existingMeal.getQuantity() + newMeal.getQuantity());
                        existingMeal.setTotalCost(existingMeal.getTotalCost() + newMeal.getTotalCost());
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    donatedMeals.add(new DonatedMeal(
                            newMeal.getName(),
                            newMeal.getQuantity(),
                            newMeal.getPricePerMeal(),
                            newMeal.getTotalCost()
                    ));
                }
            }

            // Print donation details
            System.out.println("The remaining balance in the Application is: " + result.getRemainingBalance());
            System.out.println("\nDonated meals:");
            for (DonatedMeal meal : result.getDonatedMeals()) {
                System.out.println(meal.getQuantity() + "x " + meal.getName() +
                        " ($" + String.format("%.2f", meal.getTotalCost()) + ")");
            }
            System.out.println("\nTotal value donated: $" + String.format("%.2f", result.getTotalValueDonated()));
            System.out.println("Donation Done Successfully to the Restaurant");
        } else {
            System.out.println("Donation Failed, Insufficient Balance");
        }
    }
}
