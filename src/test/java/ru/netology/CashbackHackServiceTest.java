package ru.netology;


import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldCorrectAmount() {
        int actual = service.remain(2300);
        int expected = 700;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn0() {
        int actual = service.remain(1000);
        int expected = 0;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn1000() {
        int actual = service.remain(0);
        int expected = 1000;
        Assert.assertEquals(actual, expected);
    }
}