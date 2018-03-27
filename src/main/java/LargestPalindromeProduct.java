import java.util.Scanner;

public class LargestPalindromeProduct {

    private boolean isPalindrome(int num) {
        String cadena = String.valueOf(num);
        String revCadena = new StringBuilder(cadena).reverse().toString();
        if (cadena.equals(revCadena)) {
            return true;
        } else {
            return false;
        }
    }

    private int calculatePalindome(int n) {

        int largestProduct = 0;
        for ( int i = n; i >= 101101; i-- ) {
            if (n > 999999) {
                break;
            }
            if (isPalindrome(i)) {
                for ( int a = 999; a >= 100 ; a-- ) {
                    if (i >= a*999) {
                        break;
                    }
                    if ( i % a == 0 ) {
                        for ( int b = 999; b >= 100; b-- ) {
                            int product = a * b;
                            if ( product == i && product >= largestProduct ) {
                                largestProduct = product;
                                System.out.println(largestProduct);
                                break;
                            }
                        }
                        break;
                    }
                }
            }
        }
        return largestProduct;
    }

    private int testCases(int t) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            calculatePalindome(n);
        }
        return t;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        new LargestPalindromeProduct().testCases(t);

    }
}
