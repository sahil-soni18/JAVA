package OOP;

class Person {

    String name;
    String Profession;

    public Person(String name, String Profession ) {
        this.name = name;
        this.Profession = Profession;
    }

    public void Introduce () {
        System.out.println("Hi, I'm " + name + " I work as a " + Profession);
    }
}

public class Classes {
    public static void main(String[] args) {
        
        Person person1 = new Person("Sahil", "Engineer");
        
        person1.Introduce();
    }

}
