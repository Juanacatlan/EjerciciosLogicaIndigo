public class LargestProductInASeries {

    public int calculateProduct(int n, int k, String num) {
        int largestProduct = 0;
        for (int i = 0; i <= n - k; i++){
            int product = 1;
            for (int j = i; j < i + k; j++){
                product *= Character.getNumericValue(num.charAt(j));
            }
            if (product > largestProduct) largestProduct = product;
        }
        return largestProduct;
    }
}
