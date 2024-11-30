package Restraunt.Meal;

import java.util.ArrayList;

public class Meal {
    private String name;
    private double price;
    private ArrayList<String> Ingredients =new ArrayList<>();                                    // Ingredients: مكونات
    private int Quantity;                                                                        // Quantity كميةالوجبات المتاحه وهي بتنقص

    public Meal(String name, double price, ArrayList<String> ingredients, int Quantity) {
        this.name = name;
        this.price = price;
        Ingredients = ingredients;
        this.Quantity=Quantity;
    }

    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public ArrayList<String> getIngredients() {
        return Ingredients;
    }
    public int getQuantity() {
        return Quantity;
    }
    public void setQuantity(int quantity) {
        Quantity = quantity;
    }
    public void ReduceQuantity(){
        if(Quantity>0){
            Quantity--;
        }
        else
            System.out.println("This Meal is Out of the stock ,Come Later");
    }


    @Override
    public String toString() {
        return "Meals{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", Ingredients=" + Ingredients +
                ", Quantity=" + Quantity +
                '}';
    }
}
