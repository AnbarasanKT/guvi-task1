import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the purchase amount: ");
        double purchaseamount = sc.nextDouble();
        double discount = 0;
        if (purchaseamount >= 1000) {
            discount = 0.2 * purchaseamount;
        } else if (purchaseamount >= 500) {
            discount = 0.1 * purchaseamount;
        }
        double finalAmount = purchaseamount - discount;
        System.out.println("Final payble amount: " + finalAmount);
    }
}
