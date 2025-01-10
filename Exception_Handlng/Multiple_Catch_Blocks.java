package Exception_Handlng;

public class Multiple_Catch_Blocks {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            System.out.println("Array element: " + numbers[3] + '5'); // ArrayIndexOutOfBoundsException
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception caught.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out of Bounds Exception caught.");
        } catch (Exception e) {
            System.out.println("General Exception caught.");
        }
    }
}
