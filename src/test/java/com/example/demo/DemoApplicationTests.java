package com.example.demo;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.Assert.assertEquals;

@SpringBootTest
class DemoApplicationTests {

    private ChiliRepo chiliRepo;

    @Before
    public void setup() { chiliRepo = new ChiliRepo(); }

    @Test
    public void compareScoville() {
        assertEquals("Habanero is spicier than Bell Pepper", MethodsForTest.spicierChili(new Chili("Bell Pepper", 0), new Chili("Habanero", 250000)));
        assertEquals("Ancho Pepper is spicier than Banana Pepper", MethodsForTest.spicierChili(new Chili("Ancho Pepper", 1000), new Chili("Banana Pepper", 200)));
        assertEquals("Carolina Reaper is spicier than Ghost Pepper", MethodsForTest.spicierChili(new Chili("Ghost Pepper", 1000000), new Chili("Carolina Reaper", 2200000)));
    }
    
}
