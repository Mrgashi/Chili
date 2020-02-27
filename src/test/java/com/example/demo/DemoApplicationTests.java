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
    public void compareScoville() {
        assertEquals("Habanero is spicier than Bell Pepper", MethodsForTest.spicierChili(new Chili("Bell Pepper", 0), new Chili("Habanero", 250000)));
        assertEquals("Ancho Pepper is spicier than Banana Pepper", MethodsForTest.spicierChili(new Chili("Ancho Pepper", 1000), new Chili("Banana Pepper", 200)));
        assertEquals("Carolina Reaper is spicier than Ghost Pepper", MethodsForTest.spicierChili(new Chili("Ghost Pepper", 1000000), new Chili("Carolina Reaper", 2200000)));
    }

    @Test
    public void addNewChilies() {
        ChiliRepository chiliRepository = new ChiliRepository();

        chiliRepository.addNewChilies(1, "Bell Pepper", 0);
        Assert.assertEquals(21, chiliRepository.getSize());

        chiliRepository.addNewChilies(33, "Carolina Reaper", 2_200_000);
        Assert.assertEquals(14, chiliRepository.numberOfPages(pageSize));
    }

    @Test
    public void testDataWithJPA() {
        List<Chili> chiliList = demoService.getDataWithJPA(1_000_000);

        Assert.assertEquals("size of result is 4", 4, chiliList.size());
        Assert.assertEquals("Bell Pepper has a Scoville score of 0.", 0, chiliList.get(0).getScovilleOfChili());
        Assert.assertEquals("Carolina Reaper is the hottest chiliList.", "Carolina Reaper", chiliList.get(chiliList.size() - 1).getNameOfChili());
        Assert.assertEquals("Chili with name Carolina Reaper is red.", "RED", chiliList.get(chiliList.size() - 1).getColorOfChili());
    }
}
