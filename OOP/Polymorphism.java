
package OOP;

class NextJS {
    public void End() {
        System.out.println("Rendering NextJS Frontend...");
    }

    public void StartUI() {
        System.out.println("Starting NextJS Frontend...");
    }

    
}

class NextJSBackend extends NextJS {
    @Override
    public void End() {
        System.out.println("Rendering NextJS Backend...");
    }

    public void StartBackend() {
        System.out.println("Starting NextJS Backend...");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        NextJS js = new NextJSBackend();   // Upcasting.

        js.End();
        // js.StartBackend();    // Error: method not found.
        js.StartUI();    // Correct method called.

        NextJSBackend jsb = (NextJSBackend) js;   // Downcasting.
        jsb.StartBackend();    // Correct method called.
        jsb.End();
        // jsb.StartUI();    // Error: method not found.
    }
}