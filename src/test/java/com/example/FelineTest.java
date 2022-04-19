package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;

public class FelineTest {


    @Test
    public void getExpectedMeat() throws Exception {
        Feline feline = spy(new Feline());
        feline.eatMeat();
        verify(feline).getFood("Хищник");
    }
    @Test
    public void getExpectedFamily() {
        Feline feline = new Feline();
        String expectedFamily = "Кошачьи";
        String actualFamily = feline.getFamily();
        Assert.assertEquals(expectedFamily, actualFamily);
    }
    @Test
    public void getExpectedKittens() {
        Feline feline = spy(new Feline());
        int expectedkitties = 10;
        Mockito.when(feline.getKittens()).thenReturn(expectedkitties);
        int actualKittens = feline.getKittens();
        Mockito.verify(feline, Mockito.times(2)).getKittens();
        Assert.assertEquals(expectedkitties, actualKittens );
    }

}