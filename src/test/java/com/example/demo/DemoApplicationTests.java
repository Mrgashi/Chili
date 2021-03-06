package com.example.demo;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
class DemoApplicationTests {
    int pageSize = 4;

    @Autowired
    DemoService demoService;

    @Test
    public void contextLoads() {
    }

    @Test
    public void testDataWithJPA() {
        List<Chili> chiliList = demoService.getDataWithJPA(1_000_000);

        Assert.assertEquals("size of result is 4", 4, chiliList.size());
        Assert.assertEquals("The mildest chili in this subgroup of chilies has a Scoville score of 1_200_000. Rob thinks this is a weak chili.", 1_200_000, chiliList.get(chiliList.size() - 1).getScovilleOfChili());
        Assert.assertEquals("Rob dares you to eat the hottest chili in the world, which is called Carolina Reaper.", "Carolina Reaper", chiliList.get(0).getNameOfChili());
        Assert.assertEquals("Chili with name Trinidad Scorpion Butch T is red.", "RED", chiliList.get(chiliList.size() - 1).getColorOfChili());
    }
}
