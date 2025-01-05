package OOP;


class Helper {

    // Method of helper class
    void show()
    {
        // Print statement
        System.out.println(
            "i am in show method of super class");
    }
}



public class Anonymous_Inner_Class {
    //  An anonymous class with Demo as base class
    static Helper d = new Helper() {
        // Method 1
        // show() method
        void show()
        {
            // Calling method show() via super keyword
            // which refers to parent class
            // super.show();

            // Print statement
            System.out.println("i am in Flavor1Demo class");
        }
    };

    // Method 2
    // Main driver method
    public static void main(String[] args)
    {
        // Calling show() method inside main() method
        d.show();
    }
}
