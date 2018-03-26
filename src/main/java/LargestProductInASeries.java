import java.util.Scanner;

public class LargestProductInASeries {

    private static int calculateProduct(int n) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        String num = in.next();


        int largestProduct = 0;
            for (int i = 0; i <= n - k; i++){
                int product = 1;
                for (int j = i; j < i + k; j++){
                    product *= Character.getNumericValue(num.charAt(j));
                }
                if (product > largestProduct) largestProduct = product;
            }
            System.out.println(largestProduct);

        return largestProduct;
    }

    private static int testCases(int t) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int largestProduct = 0;
        for(int a0 = 0; a0 < t; a0++){
            largestProduct = calculateProduct(n);
        }
        return largestProduct;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        int lpp = LargestProductInASeries.testCases(t);

    }
}
