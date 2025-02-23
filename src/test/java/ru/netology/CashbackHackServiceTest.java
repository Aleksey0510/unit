package ru.netology;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldCorrectAmount() {
        int actual = service.remain(2300);
        int expected = 700;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldReturn0() {
        int actual = service.remain(1000);
        int expected = 0;
        Assert.assertEquals(actual, expected);

    }

    @Test
    public void shouldReturn1000() {
        int actual = service.remain(0);
        int expected =1000;
        Assert.assertEquals(actual, expected);

    }
}