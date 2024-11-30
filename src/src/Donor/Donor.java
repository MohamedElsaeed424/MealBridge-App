package Donor;
import Application.Application;
import Restraunt.Restaurant;

import java.util.* ;

public class Donor {
    private String name ;

    public Donor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void donateToApplication(double balance , Application application){ //donate for restaurant
        application.increaseBalance(balance);
        System.out.println("Donation Done Successfully to the Application");
    }

    @Override
    public String toString() {
        return "Donor{" +
                "name='" + name + '\'' +
                '}';
    }
}
