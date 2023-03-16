package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;
public  class CashbackHackServiceTest {

    @Test
    public void shouldCount1Test() {
        CashbackHackService service = new CashbackHackService();
        Assert.assertEquals(service.remain(1000), 1000);

    }
    @Test
    public void shouldCount1Test2() {
        CashbackHackService service = new CashbackHackService();
        Assert.assertEquals(service.remain(10), 990);

    }
    @Test
    public void shouldCount1Test3() {
        CashbackHackService service = new CashbackHackService();
        Assert.assertEquals(service.remain(1500), 500);

    }
    @Test
    public void shouldCount1Test4() {
        CashbackHackService service = new CashbackHackService();
        Assert.assertEquals(service.remain(1000), 0);

    }
}
