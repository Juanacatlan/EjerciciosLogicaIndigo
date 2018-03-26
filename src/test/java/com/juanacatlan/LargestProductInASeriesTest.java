package com.juanacatlan;

import junit.framework.TestCase;
import org.junit.Test;

public class LargestProductInASeriesTest extends TestCase {

    LargestProductInASeries example = new LargestProductInASeries();

    @Test
    public void largestProductInASeries_Test1 () {
        int n = 10;
        int k = 5;
        String num = "3675356291";
        int expected = 3150;
        String param [] = {"10", "5", num};
        String [] actual = AbstractMainTests.executeMain("LargestProductInASeries", param);
        assertEquals(expected, actual);
    }

    @Test
    public void largestProductInASeries_Test2 () {
        int n = 10;
        int k = 5;
        String num = "2709360626";
        int expected = 0;
        assertEquals(expected, example);
    }
}