
public class ArrayAverage {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int sum = 0;

        // Sum the elements of the array
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        // Calculate the average
        double average = (double) sum / numbers.length;
        System.out.println("Average: " + average);
    }
}
