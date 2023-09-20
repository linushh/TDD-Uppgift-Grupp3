package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void testBil(){
        Bil bil = new Bil();
        assertNotNull(bil);

    }

    @Test
    void lyse(){
        Bil bil = new Bil();
        bil.setLyse(true);
        assertTrue(bil.isLyse());
        bil.setLyse(false);
        assertFalse(bil.isLyse());
    }

    @Test
    void testaLyse(){
        Bil bil = new Bil();
        bil.setLyse(true);
        assertEquals("Lyser som satan", bil.lyseOnEllerOf());
        bil.setLyse(false);
        assertNotEquals("Lyser som satan", bil.lyseOnEllerOf());
    }

    @Test void helOrHalv(){
        Bil bil = new Bil();
        bil.setHalvLyse(true);
        assertTrue(bil.isHalvLyse());
        bil.setHalvLyse(false);
        assertFalse(bil.isHalvLyse());
    }

    @Test void bakLyseTest(){
        Bil bil = new Bil();
        bil.setBakLyse(false);
        assertFalse(bil.isBakLyse());
        bil.setBakLyse(true);
        assertTrue(bil.isBakLyse());
    }

    @Test
    void startaBil(){
        Bil bil = new Bil();
        bil.setBilStart(true);
        assertTrue(bil.isBilStart());
        bil.setBilStart(false);
        assertFalse(bil.isBilStart());
    }

    @Test
    void avStendBild(){
        Bil bil = new Bil();
        bil.setBilStart(false);
        bil.kontrolleraLysen();
        assertFalse(bil.isBakLyse());
        assertFalse(bil.isHalvLyse());
        assertFalse(bil.isLyse());
        bil.setBilStart(true);
        bil.kontrolleraLysen();
        assertFalse(bil.isBakLyse());
        assertTrue(bil.isHalvLyse());
        assertTrue(bil.isLyse());
    }

    @Test
    void varningsBlinkers(){
        Bil bil = new Bil();
        bil.setBilStart(false);
        bil.setBlinkers(true);
        assertTrue(bil.isBlinkers());
        bil.setBilStart(false);
        bil.setBlinkers(true);
        assertTrue(bil.isBlinkers());
    }

    @Test
    void gasaTest(){
        Bil bil = new Bil();
        bil.setGas(50);
        assertEquals(50, bil.getGas());
    }

    @Test
    void maxHastighet(){
        Bil bil = new Bil();
        bil.setHastighet(200);
        assertEquals(180, bil.getHastighet());
    }

    @Test
    void bromsa(){
        Bil bil = new Bil();
        bil.setBromsa(true);
        assertEquals(0, bil.isBromsa());
    }
}