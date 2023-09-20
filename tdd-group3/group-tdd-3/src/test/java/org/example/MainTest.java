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
        assertTrue(bil.lysePå());
        assertFalse(bil.lysePå());
    }
}