import java.util.ArrayList;

public class ArrayList_Max_Min {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(5);
        numbers.add(20);
        numbers.add(15);

        int max = numbers.get(0);
        int min = numbers.get(0);

        // Find the maximum and minimum
        for (int num : numbers) {
            if (num > max)
                max = num;
            if (num < min)
                min = num;
        }

        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
    }
}
