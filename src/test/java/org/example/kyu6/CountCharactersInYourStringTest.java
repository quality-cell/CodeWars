package org.example.kyu6;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountCharactersInYourStringTest {
    @Test
    public void exampleTest1() {
        assertEquals(new HashMap<Character, Integer>(), CountCharactersInYourString.count(""));
    }

    @Test
    void exampleTest2() {
        Map<Character, Integer> d = new HashMap<>();

        d.put('a', 1);

        assertEquals(d, CountCharactersInYourString.count("a"));
    }

    @Test
    void exampleTest3() {
        Map<Character, Integer> d = new HashMap<>();

        d.put('a', 3);
        d.put('b', 3);
        d.put('c', 1);

        assertEquals(d, CountCharactersInYourString.count("aabbbac"));
    }

    @Test
    void exampleTest4() {
        Map<Character, Integer> d = new HashMap<>();

        d.put('a', 1);
        d.put('b', 1);
        d.put('c', 1);

        assertEquals(d, CountCharactersInYourString.count("abc"));
    }

    @Test
    public void exampleTest5() {
        Map<Character, Integer> d = new HashMap<>();

        d.put('a', 5);

        assertEquals(d, CountCharactersInYourString.count("aaaaa"));
    }

    @Test
    void exampleTest6() {
        Map<Character, Integer> expected = new HashMap<>();
        Map<Character, Integer> actual = CountCharactersInYourString.count("aabb");

        expected.put('a', 2);
        expected.put('b', 2);

        assertEquals(expected, actual);
    }

}
