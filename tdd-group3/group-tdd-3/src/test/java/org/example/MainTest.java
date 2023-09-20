package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void testBil(){
        Bil bil = new Bil(false);
        assertNotNull(bil);

    }

    @Test
    void lyse(){
        Bil bil = new Bil(true);
        assertTrue(bil.isLyse());
        bil.setLyse(false);
        assertFalse(bil.isLyse());
    }

    @Test
    void testaLyse(){
        Bil bil = new Bil(true);
        assertEquals("Lyser som satan", bil.lyseOnEllerOf());
        bil.setLyse(false);
        assertNotEquals("Lyser som satan", bil.lyseOnEllerOf());
    }
}