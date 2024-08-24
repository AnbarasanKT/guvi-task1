import java.util.Scanner;

public class SmallestDigitFinder {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a number: ");
        String number = scanner.nextLine();

        char smallestDigit = '9';

              for (int i = 0; i < number.length(); i++) {
            char currentDigit = number.charAt(i);

            if (Character.isDigit(currentDigit) && currentDigit < smallestDigit) {
                smallestDigit = currentDigit;
            }
        }


              if (smallestDigit == '9') {
            System.out.println("No digits found in the input.");
        } else {

            System.out.println("The smallest digit in the number is: " + smallestDigit);
        }
    }
}
