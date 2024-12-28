package OOP;

class Language {
    
    String Lang;

    public Language(String Lang) {
        this.Lang = Lang;
    }

    public String whichLanguage () {
        return "Using " + Lang;
    }
}

class FrameWork extends Language {

    // Constructor for Library that calls the Language constructor
    public FrameWork(String Lang) {
        super(Lang); // Call the parent class constructor
    }

    public void FrameWorkName () {
        String detail = whichLanguage();
        System.out.println(detail);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Language Java = new Language("Java");
        System.out.println(Java.whichLanguage());

        FrameWork spring = new FrameWork("Spring");

        spring.FrameWorkName();
    }
}
