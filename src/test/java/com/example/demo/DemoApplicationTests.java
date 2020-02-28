package com.example.demo;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
        Assert.assertEquals("xxxxx has a Scoville score of 1_200_000.", 1_200_000, chiliList.get(0).getScovilleOfChili());
        Assert.assertEquals("Carolina Reaper is the hottest chiliList.", "Carolina Reaper", chiliList.get(chiliList.size() - 1).getNameOfChili());
       // Assert.assertEquals("Chili with name Carolina Reaper is red.", "RED", chiliList.get(chiliList.size() - 1).getColorOfChili());
    }
}
