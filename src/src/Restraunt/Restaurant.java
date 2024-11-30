package Restraunt;

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

    public void DonateMeals(double balance){

    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
