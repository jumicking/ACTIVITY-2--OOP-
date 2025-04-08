/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activity2_oop;

/**
 *
 * @author MALILONG_CpE121
 */
public class MOTORCYCLE extends VEHICLE{
  
    private boolean hasHelmelRental;

    public MOTORCYCLE(String make, String model, double RentalPrice, boolean hasHelmetRental) {
        super(make, model, RentalPrice);
        this.hasHelmelRental = hasHelmetRental;

    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Helmet Rental Available: " + (hasHelmelRental ? "YES" : "NO"));
    }
}

