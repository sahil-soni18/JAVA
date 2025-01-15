package Java8_Features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * What are Lambda Expressions?
A concise way to represent anonymous functions (functions without a name).
Syntax:
(parameters) -> { expression/body }
 */

 class Employee {
    String name;
    int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    // Getters and Setters (omitted for brevity) 
    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}


public class LambdaExpressions {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", 30000));
        employees.add(new Employee("Bob", 50000));
        employees.add(new Employee("Charlie", 25000));

        // Traditional way using anonymous inner class
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return Integer.compare(e1.getSalary(), e2.getSalary()); 
            }
        });

        System.out.println("Sorted by Salary (Traditional): " + employees);

        // Using Lambda Expression
        Collections.sort(employees, (e1, e2) -> Integer.compare(e1.getSalary(), e2.getSalary()));

        System.out.println("Sorted by Salary (Lambda): " + employees);
    }
}


/*
 * How toString() affects output:

Implicit Call: When you use System.out.println() to print an object (like an Employee in our example), Java implicitly calls the object's toString() method.
Default Behavior: If you don't override toString() in your class, Java uses the default implementation from the Object class. This default implementation generally provides a less informative output, often including the object's class name and a hash code.
Overridden Behavior: By overriding toString() in the Employee class, you customize how the object is represented as a string. This allows you to control the information displayed when the object is printed.
 */