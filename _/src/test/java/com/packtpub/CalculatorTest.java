package com.packtpub;


import junit.framework.Assert;
import junit.framework.TestCase;

public class CalculatorTest extends TestCase {
    public void testSum() throws Exception {
        Calculator calculator = new Calculator();
        int sum = calculator.sum(1, 2);
        Assert.assertEquals(sum, 3);
    }

    public void testGood() throws Exception {
        Assert.assertTrue("Some bad test has failed", true);
    }
}
