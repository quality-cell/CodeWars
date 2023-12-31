package org.example.kyu5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ProductOfConsecutiveFibNumbersTest {
    @Test
    void exampleTest1() {
        assertArrayEquals(new long[] {55, 89, 1}, ProductOfConsecutiveFibNumbers.productFib(4895));
    }
    @Test
    void exampleTest2() {
        assertArrayEquals(new long[] {89, 144, 0}, ProductOfConsecutiveFibNumbers.productFib(5895));
    }
}
