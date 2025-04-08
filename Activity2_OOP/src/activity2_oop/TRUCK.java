/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activity2_oop;

/**
 *
 * @author MALILONG_CpE121
 */
public class TRUCK extends VEHICLE{
    

    private double payloadCapacity;

    public TRUCK(String make, String model, double rentalPrice, double PayloadCapacity) {
        super(make, model, rentalPrice);
        this.payloadCapacity = PayloadCapacity;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Payload Capacity: " + payloadCapacity + " tons");
        
    }
}

