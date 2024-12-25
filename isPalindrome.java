
import java.util.Scanner;;

public class isPalindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        
        int start = 0;
        int end = str.length() - 1;

        while ( start < end && str.charAt(start) == str.charAt(end) ) {
                start++;
                end--;
        }

        if ( start < end ) {

            System.out.println(str + " is not a palindrome.");
        } else {
            System.out.println(str + " is a palindrome.");
        }
        input.close();
    }
}
