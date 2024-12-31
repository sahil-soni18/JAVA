package OOP;

abstract class Compiler {
   abstract void compileCode();
}

class Language extends Compiler {
    @Override
    void compileCode() {
        System.out.println("Compiling code...");
    }

}


public class Abstraction {
    public static void main(String[] args) {
        Compiler compile = new Language();
        compile.compileCode();
    }
}

/*
 * Why Abstract Classes Promote Abstraction
Abstract classes define a contract (what must be done) but defer the implementation (how it is done) to the subclasses. This hides the internal workings of each subclass from the code interacting with the abstract class.
 */
