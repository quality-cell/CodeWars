package org.example.kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class YouAreASquareTest {
    @Test
    void exampleTest1() {
        assertFalse(YouAreASquare.isSquare(-1), "negative numbers aren't square numbers");
    }

    @Test
    void exampleTest2() {
        assertTrue(YouAreASquare.isSquare(0), "0 is a square number (0 * 0)");
    }

    @Test
    void exampleTest3() {
        assertFalse(YouAreASquare.isSquare(3), "3 isn't a square number");
    }

    @Test
    void exampleTest4() {
        assertTrue(YouAreASquare.isSquare(4), "4 is a square number (2 * 2)");
    }

    @Test
    void exampleTest5() {
        assertTrue(YouAreASquare.isSquare(25), "25 is a square number (5 * 5)");
    }

    @Test
    void exampleTest6() {
        assertFalse(YouAreASquare.isSquare(26), "26 isn't a square number");
    }
}
