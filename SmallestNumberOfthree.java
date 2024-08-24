import java.util.Scanner;
public class SmallestNumberOfthree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        int smallestNumber = num1;

        if (num2 < smallestNumber) {
            smallestNumber = num2;
        }

        if (num3 < smallestNumber) {
            smallestNumber = num3;
        }

        System.out.println("The smallest number among " + num1 + ", " + num2 + ", and " + num3 + " is: " + smallestNumber);

    }
}

