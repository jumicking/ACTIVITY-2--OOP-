/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package activty2_oop;

/**
 *
 * @author Malilong
 */
public class ACTIVTY2_OOP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         Vehicle[] vehicles = new Vehicle[5];
       
        vehicles[0] = new Car(": Honda", ": Civic", 80.0, 4);
        vehicles[1] = new Truck(": Nissan", ": Titan", 70.0, 2.5);
        vehicles[2] = new Motorcycle(": Yamaha", ": YZF-R3", 30.0, true);
        vehicles[3] = new ElectricCar(": BMW", ": i4", 900.0, 10.0);
        vehicles[4] = new ToyCar(": Hot Wheels", ": Bone Shaker", 200.0, 25);


        int rentalDays = 3;
        double discount =10.0; // 10.0% discount
        
        // Loop through each vehicle and display its details and rental cost
        for (Vehicle v : vehicles) {
            v.displayDetail();
            System.out.println("Rental Cost for " + rentalDays + " days: $" + v.CalculateRentalPrice(rentalDays));
            System.out.println("Discounted Rental Cost (10% off): $" + v.CalculateDiscountedRentalCost(rentalDays, discount));
            v.performMaintenance();
            System.out.println("-----------------------------");
        }
    }

}
    
    

