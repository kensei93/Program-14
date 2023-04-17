package ru.netology.service;


import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceTest {

    @Test
    public void calculateServiceInTheBoundary () {
        CashbackHackService service = new CashbackHackService();

        int amount = 1350;

        int actual = service.remain(amount);
        int expected = 650;
        System.out.println(actual);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void calculateServiceNotInTheBoundary () {
        CashbackHackService service = new CashbackHackService();

        int amount = 500;

        int actual = service.remain(amount);
        int expected = 500;
        System.out.println(actual);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void calculateServiceInTheGradle () {
        CashbackHackService service = new CashbackHackService();

        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        System.out.println(actual);

        Assert.assertEquals(actual, expected);
    }
}
