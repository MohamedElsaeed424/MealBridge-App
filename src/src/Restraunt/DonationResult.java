package Restraunt;

import Restraunt.Meal.DonatedMeal;

import java.util.List;// Class to hold donation details
public class DonationResult {
    private List<DonatedMeal> donatedMeals;
    private double totalValueDonated;

    public DonationResult(List<DonatedMeal> donatedMeals, double totalValueDonated) {
        this.donatedMeals = donatedMeals;
        this.totalValueDonated = totalValueDonated;
    }

    // Getters
    public List<DonatedMeal> getDonatedMeals() { return donatedMeals; }
    public double getTotalValueDonated() { return totalValueDonated; }

    @Override
    public String toString() {
        return "DonationResult{" +
                ", donatedMeals=" + donatedMeals +
                ", totalValueDonated=" + totalValueDonated +
                '}';
    }
}

