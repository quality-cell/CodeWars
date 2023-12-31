package org.example.kyu6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WhoLikesItTest {
    @Test
    void exampleTest1() {
        assertEquals("no one likes this", WhoLikesIt.whoLikesIt());
    }

    @Test
    void exampleTest2() {
        assertEquals("Peter likes this", WhoLikesIt.whoLikesIt("Peter"));
    }

    @Test
    void exampleTest3() {
        assertEquals("Jacob and Alex like this", WhoLikesIt.whoLikesIt("Jacob", "Alex"));
    }

    @Test
    void exampleTest4() {
        assertEquals("Max, John and Mark like this", WhoLikesIt.whoLikesIt("Max", "John", "Mark"));
    }

    @Test
    void exampleTest5() {
        assertEquals("Alex, Jacob and 2 others like this", WhoLikesIt.whoLikesIt("Alex", "Jacob", "Mark", "Max"));
    }
}
