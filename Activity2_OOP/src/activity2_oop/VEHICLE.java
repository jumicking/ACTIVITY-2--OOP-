/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activity2_oop;

/**
 *
 * @author MALILONG_CpE121
 */
public class VEHICLE {

    protected String make;
    protected String model;
    protected double rentalPrice;

    public VEHICLE(String make, String model, double rentalPrice) {
        this.make = make;
        this.model = model;
        this.rentalPrice = rentalPrice;
    }

    public void displayDetails() {
        System.out.println("Vehicle Details: ");
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Rental Price: " + rentalPrice);
    }

    public double calculateRentalCost(int days) {
        return rentalPrice * days;
    }
}

