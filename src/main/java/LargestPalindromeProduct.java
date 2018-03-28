class LargestPalindromeProduct {

    private boolean isPalindrome(int num) {
        String cadena = String.valueOf(num);
        String revCadena = new StringBuilder(cadena).reverse().toString();
        if (cadena.equals(revCadena)) {
            return true;
        } else {
            return false;
        }
    }

    public int obtainLargestPalindome(int n) {
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
}
