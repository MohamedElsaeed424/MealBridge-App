package Application;

import Restraunt.Restaurant;

public class Application {
    final private String name = "Food Donation Application";
    private double balance = 0;

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
            restaurant.DonateMeals(balance);
            System.out.println("Donation Done Successfully to the Restaurant");
        } else {
            System.out.println("Donation Failed, Insufficient Balance");
        }
    }
}
