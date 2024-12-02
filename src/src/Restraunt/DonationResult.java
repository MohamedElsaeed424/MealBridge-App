package Restraunt;

import Restraunt.Meal.DonatedMeal;

import java.util.List;// Class to hold donation details
public class DonationResult {
    private double remainingBalance;
    private List<DonatedMeal> donatedMeals;
    private double totalValueDonated;

    public DonationResult(double remainingBalance, List<DonatedMeal> donatedMeals, double totalValueDonated) {
        this.remainingBalance = remainingBalance;
        this.donatedMeals = donatedMeals;
        this.totalValueDonated = totalValueDonated;
    }

    // Getters
    public double getRemainingBalance() { return remainingBalance; }
    public List<DonatedMeal> getDonatedMeals() { return donatedMeals; }
    public double getTotalValueDonated() { return totalValueDonated; }

    @Override
    public String toString() {
        return "DonationResult{" +
                "remainingBalance=" + remainingBalance +
                ", donatedMeals=" + donatedMeals +
                ", totalValueDonated=" + totalValueDonated +
                '}';
    }
}

