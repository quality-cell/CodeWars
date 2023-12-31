package org.example.kyu6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EqualSidesOfAnArrayTest {
    @Test
    void exampleTest1() {
        assertEquals(3, EqualSidesOfAnArray.findEvenIndex(new int[] {1,2,3,4,3,2,1}));
    }

    @Test
    void exampleTest2() {
        assertEquals(1, EqualSidesOfAnArray.findEvenIndex(new int[] {1,100,50,-51,1,1}));
    }

    @Test
    void exampleTest3() {
        assertEquals(-1, EqualSidesOfAnArray.findEvenIndex(new int[] {1,2,3,4,5,6}));
    }

    @Test
    void exampleTest4() {
        assertEquals(3, EqualSidesOfAnArray.findEvenIndex(new int[] {20,10,30,10,10,15,35}));
    }

    @Test
    void exampleTest5() {
        assertEquals(3, EqualSidesOfAnArray.findEvenIndex(new int[] {20,10,30,10,10,15,35}));
    }

    @Test
    void exampleTest6() {
        assertEquals(-1, EqualSidesOfAnArray.findEvenIndex(new int[] {-8505, -5130, 1926, -9026}));
    }

    @Test
    void exampleTest7() {
        assertEquals(1, EqualSidesOfAnArray.findEvenIndex(new int[] {2824, 1774, -1490, -9084, -9696, 23094}));
    }

    @Test
    void exampleTest8() {
        assertEquals(6, EqualSidesOfAnArray.findEvenIndex(new int[] {4, 5, 6, 7, 8, 9, 10, 9, 8, 7, 6, 5, 4}));
    }
}
