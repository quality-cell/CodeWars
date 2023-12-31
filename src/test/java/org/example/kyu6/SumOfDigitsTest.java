package org.example.kyu6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumOfDigitsTest {
    @Test
    void exampleTest1() {
        assertEquals(7, SumOfDigits.digital_root(16));
    }

    @Test
    void exampleTest2() {
        assertEquals(6,  SumOfDigits.digital_root(456));
    }
}
