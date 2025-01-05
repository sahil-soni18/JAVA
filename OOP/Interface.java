package OOP;

interface Vehicle {
    
    // Abstract methods defined
    void changeGear(int a);
    void speedUp(int a);
    void applyBrakes(int a);

    // Default method
    default void Sound () {
        System.out.println("Beep Beep");
    }

    // Static method
    static void petrol () {
        System.out.println("Petrol");
    }

}

// Class implementing vehicle interface
class Bicycle implements Vehicle{
    
    int speed;
    int gear;

    // Constructor
    public Bicycle() {
        Vehicle.petrol();
    }
    
    // Change gear
    @Override
    public void changeGear(int newGear){
        gear = newGear;
    }
    
    // Increase speed
    @Override
    public void speedUp(int increment){
        speed = speed + increment;
    }
    
    // Decrease speed
    @Override
    public void applyBrakes(int decrement){
        speed = speed - decrement;
    }
    
    public void printStates() {
        System.out.println("speed: " + speed
            + " gear: " + gear);
    }
}

// Class implementing vehicle interface
class Bike implements Vehicle {
    
    int speed;
    int gear;
    
    // Change gear
    @Override
    public void changeGear(int newGear){
        gear = newGear;
    }
    
    // Increase speed
    @Override
    public void speedUp(int increment){
        speed = speed + increment;
    }
    
    // Decrease speed
    @Override
    public void applyBrakes(int decrement){
        speed = speed - decrement;
    }
    
    public void printStates() {
        System.out.println("speed: " + speed
            + " gear: " + gear);
    }
    
}

public class Interface {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle();
        
        bicycle.changeGear(2);
        bicycle.speedUp(3);
        bicycle.applyBrakes(1);
        
        System.out.print("Bicycle present state : ");
        bicycle.printStates();
        
        // Instance of Bike (Object)
        Bike bike = new Bike();
        bike.changeGear(1);
        bike.speedUp(4);
        bike.applyBrakes(3);
        bike.Sound();
        
        System.out.print("Bike present state : ");
        bike.printStates();
    }
}

// To Study About Interfaces in Java visit: https://www.geeksforgeeks.org/interfaces-in-java/

