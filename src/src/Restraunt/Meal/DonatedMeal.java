package Restraunt.Meal;

public class DonatedMeal {
    private String name;
    private int quantity;
    private double pricePerMeal;
    private double totalCost;

    public DonatedMeal(String name, int quantity, double pricePerMeal, double totalCost) {
        this.name = name;
        this.quantity = quantity;
        this.pricePerMeal = pricePerMeal;
        this.totalCost = totalCost;
    }

    // Getters
    public String getName() { return name; }
    public int getQuantity() { return quantity; }
    public double getPricePerMeal() { return pricePerMeal; }
    public double getTotalCost() { return totalCost; }

    // Setters
    public void setQuantity(int quantity) { this.quantity = quantity; }
    public void setTotalCost(double totalCost) { this.totalCost = totalCost; }


    @Override
    public String toString() {
        return "DonatedMeal{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                ", pricePerMeal=" + pricePerMeal +
                ", totalCost=" + totalCost +
                '}';
    }
}

