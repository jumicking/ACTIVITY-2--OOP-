/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package activity2_oop;

/**
 *
 * @author MALILONG_CpE121
 */
public class Activity2_OOP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        // Create an array of Vehicle objects demonstrating polymorphism
        VEHICLE[] vehicles = new VEHICLE[3];
        
        vehicles[0] = new CAR("Toyota", "Camry", 50.0, 4);
        vehicles[1] = new TRUCK("Ford", "F-150", 80.0, 2.5);
        vehicles[2] = new MOTORCYCLE("Harley-Davidson", "Street 750", 40.0, true);
        
        int rentalDays = 3;
        // Loop through each vehicle and display its details and rental cost
        for (VEHICLE v : vehicles) {
            v.displayDetails();
            System.out.println("Rental Cost for " + rentalDays + " days: $" + v.calculateRentalCost(rentalDays));
            System.out.println("-----------------------------");
        }
    }
}
    
    

