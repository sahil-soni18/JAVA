import java.util.Scanner;

public class JavaSwitch_DayOfWeek {
    public static void main(String[] args) {   
        Scanner scanner = new Scanner(System.in);

        int dayNumber = scanner.nextInt();

        String dayName = switch ( dayNumber ) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid day number!";
        };

        System.out.println(dayName);

        scanner.close();
    }
}
