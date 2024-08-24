public class PatternPrinter {
    public static void main(String[] args) {

        int rows = 5;
        for (int i = 0; i < rows; i++) {
            for (int j = 5; j > 0; j--) {
                if (j > (5 - i)) {
                    System.out.print(j);
                } else {
                    System.out.print(5 - i);
                }
            }

            System.out.println();
        }
    }
}
