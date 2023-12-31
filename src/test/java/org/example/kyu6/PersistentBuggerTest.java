package org.example.kyu6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PersistentBuggerTest {
    @Test
    void exampleTest1() {
        assertEquals(3, PersistentBugger.persistence( 39), "Incorrect answer for n=39" );
    }

    @Test
    void exampleTest2() {
        assertEquals(0, PersistentBugger.persistence(  4), "Incorrect answer for n=4"  );
    }

    @Test
    void exampleTest3() {
        assertEquals(2, PersistentBugger.persistence( 25), "Incorrect answer for n=25" );
    }

    @Test
    void exampleTest4() {
        assertEquals(4, PersistentBugger.persistence(999), "Incorrect answer for n=999");
    }
}
