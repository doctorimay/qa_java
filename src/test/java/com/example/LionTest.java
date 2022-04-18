package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)

public class LionTest {

    @Mock
    Feline feline;

    @Test
    public void getMaleSex() throws Exception {
        Lion lion = new Lion(feline, "Самец");
        Assert.assertTrue(lion.doesHaveMane());
    }
    @Test
    public void getFemaleSex() throws Exception {
        Lion lion = new Lion(feline, "Самка");
        Assert.assertFalse(lion.doesHaveMane());
    }
    @Test(expected = Exception.class)
    public void getManeExceptions() throws Exception {
        Lion lion = new Lion(feline, "Какая-то дичь");
        when(lion.hasMane).thenThrow(Exception.class);
    }
    @Test
    public void getKitties() throws Exception {
        Lion lion = new Lion(feline, "Самка");
        int expectedKitties = 36;
        Mockito.when(lion.getKittens()).thenReturn(36);
        int actualKitties = lion.getKittens();
        Assert.assertEquals(expectedKitties, actualKitties);
    }
    @Test
    public void getFoodList() throws Exception {
        Lion lion = new Lion(new Feline(), "Самец");
        List<String> exceptedFoodList = List.of("Животные", "Птицы", "Рыба");
        List<String> actualFoodList = lion.getFood() ;
        Assert.assertEquals(exceptedFoodList, actualFoodList);
    }
}