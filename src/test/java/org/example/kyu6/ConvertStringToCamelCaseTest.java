package org.example.kyu6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConvertStringToCamelCaseTest {
    @Test
    void exampleTest1() {
        assertEquals("theStealthWarrior", ConvertStringToCamelCase.toCamelCase("the_Stealth_Warrior"));
    }

    @Test
    void exampleTest2() {
        assertEquals("theStealthWarrior", ConvertStringToCamelCase.toCamelCase("the-Stealth-Warrior"));
    }
}
