import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int reverseNumber = 0;
        while (num != 0) {
            reverseNumber = reverseNumber * 10 + num % 10;
            num /= 10;
        }
        System.out.println(reverseNumber);
    }
}
