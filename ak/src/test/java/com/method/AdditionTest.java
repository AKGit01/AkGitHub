package com.method;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AdditionTest {

    @Test
    public void testAddTwoNumbers() {
        Addition addition = new Addition();
        int result = addition.add(3, 4);
        Assert.assertEquals(result, 7, "Addition of two numbers failed");
    }

    @Test
    public void testAddThreeNumbers() {
        Addition addition = new Addition();
        int result = addition.add(2, 4, 8);
        Assert.assertEquals(result, 14, "Addition of three numbers failed");
    }
}
