package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


@RunWith(Parameterized.class)
public class FelineParameterized {
    private final int kittiesCount;
    private final int expectedKitties;

    public FelineParameterized ( int kittiesCount, int expectedKitties) {
        this.kittiesCount = kittiesCount;
        this.expectedKitties = expectedKitties;
    }

    @Parameterized.Parameters
    public static Object[][] getKittiesData() {
        return new Object[][] {
                {1 , 2},
                {5 , 1}
        };
    }
    @Test
    public void shouldBeSum() {
        Feline feline = new Feline();
        int actualKitties = feline.getKittens();
        Assert.assertEquals(expectedKitties, actualKitties);
    }

}