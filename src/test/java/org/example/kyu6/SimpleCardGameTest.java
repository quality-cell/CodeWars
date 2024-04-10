package org.example.kyu6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleCardGameTest {
    private final SimpleCardGame game = new SimpleCardGame();

    @Test
    void steveWins() {
        assertEquals("Steve wins 2 to 1",
                game.winner(new String[]{"A", "7", "8"}, new String[]{"K", "5", "9"}),
                "deckSteve = [\"A\", \"7\", \"8\"], deckJosh = [\"K\", \"5\", \"9\"]");
    }

    @Test
    void tie() {
        assertEquals("Tie",
                game.winner(new String[]{"T"}, new String[]{"T"}),
                "deckSteve = [\"T\"], deckJosh = [\"T\"]");
    }

    @Test
    void joshWins() {
        assertEquals("Josh wins 1 to 0",
                game.winner(new String[]{"T", "8"}, new String[]{"T", "9"}),
                "deckSteve = [\"T\", \"8\"], deckJosh = [\"T\", \"9\"]");
    }
}
