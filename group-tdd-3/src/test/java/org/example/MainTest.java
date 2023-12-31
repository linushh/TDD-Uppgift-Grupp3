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
    void gasaTest(){  // ändra tillbaka detta 0 ska vara vad som helst men inte 0
        Bil bil = new Bil();
        bil.setGas(50);
        assertEquals(50, bil.getGas());
    }

    @Test
    void maxHastighet(){
        Bil bil = new Bil();
        bil.setBatteri(true);
        bil.setHastighet(200);
        assertEquals(180, bil.getHastighet());
    }

    @Test
    void bromsa(){
        Bil bil = new Bil();
        bil.setBromsa(true);
        assertEquals(0, bil.getHastighet());
    }

    @Test
    void vaxel() {
        Bil bil = new Bil();
        bil.setVaxel(0);
        assertEquals("Reverse", bil.getVaxel());
    }

    @Test
    void bromsljus() {
        Bil bil = new Bil();
        bil.setBromsa(true);
        assertTrue(bil.isBakLyse());
    }

    @Test
    void bakBroms() {
        Bil bil = new Bil();
        bil.setVaxel(0);
        bil.setBromsa(true);
        assertEquals(0, bil.getHastighet());
    }

    @Test
    void harBatteri() {
        Bil bil = new Bil();
        assertNotNull(bil.getBatteri());
    }

    @Test
    void batteriDras() {
        Bil bil = new Bil();
        bil.setBilStart(true);
        assertTrue(bil.getDrain());
    }

    @Test
    void lamporBatteri() {
        Bil bil = new Bil();
        bil.setLyse(true);
        assertTrue(bil.getDrain());
        bil.setLyse(false);
        assertFalse(bil.getDrain());

        bil.setHalvLyse(true);
        assertTrue(bil.getDrain());
        bil.setHalvLyse(false);
        assertFalse(bil.getDrain());

        bil.setBakLyse(true);
        assertTrue(bil.getDrain());
        bil.setBakLyse(false);
        assertFalse(bil.getDrain());

        bil.setBlinkers(true);
        assertTrue(bil.getDrain());
        bil.setBlinkers(false);
        assertFalse(bil.getDrain());
    }

    @Test
    void batteriSlut() {
        Bil bil = new Bil();
        bil.setBatteri(true);
        bil.setHastighet(140);
        bil.setBatteri(false);
        bil.setHastighet(160);
        assertEquals(140, bil.getHastighet());
    }

    @Test
    void batteriSlutLampor() {
        Bil bil = new Bil();
        bil.setBilStart(true);
        bil.setBatteri(false);
        assertFalse(bil.isLyse());
        assertFalse(bil.isHalvLyse());
        assertFalse(bil.isBakLyse());
        assertFalse(bil.isBlinkers());
    }

    @Test
    void varningsBlinkersBatteri() {
        Bil bil = new Bil();
        bil.setBlinkers(true);
        assertTrue(bil.isBlinkers());
        bil.setBatteri(false);
        assertTrue(bil.isBlinkers());
    }

    @Test
    void laddaBatteri() {
        Bil bil = new Bil();
        bil.setBatteri(false);
        assertFalse(bil.getBatteri());
        bil.setBatteri(true);
        assertTrue(bil.getBatteri());
    }
}