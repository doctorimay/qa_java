package com.example;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


@RunWith(Parameterized.class)

public class LionParameterized {

    private final String lionSex;
    private final boolean expectedSex;

    public LionParameterized(String lionSex, boolean expectedSex) {
        this.lionSex = lionSex;
        this.expectedSex = expectedSex;
    }

    @Parameterized.Parameters
    public static Object[][] getTextData() {
        return new Object[][] {
                {"Самец", true},
                {"Самка", false},

        };
    }
    @Test
    public void LionParameterized() throws Exception {
        Lion lion = new Lion(new Feline(), lionSex);
        boolean expectedResult = expectedSex;
        boolean actualResult = lion.hasMane;
        Assert.assertEquals(expectedResult, actualResult);
    }

}