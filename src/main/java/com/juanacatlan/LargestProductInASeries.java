package com.juanacatlan;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class LargestProductInASeries {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
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
        }
    }
}
