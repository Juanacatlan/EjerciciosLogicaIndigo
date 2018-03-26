package com.juanacatlan;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class LargestPalindromeProduct {

    public static boolean isPalindrome(int num) {
        String cadena = String.valueOf(num);
        String revCadena = new StringBuilder(cadena).reverse().toString();
        if (cadena.equals(revCadena)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt(); // input
        for(int a0 = 0; a0 < t; a0++){ // numero de test cases
            int n = in.nextInt(); // numero limite: 101110

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
        }
    }
}
