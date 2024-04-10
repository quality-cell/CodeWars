package org.example.kyu6;

import java.util.List;

public class SimpleCardGame {
    public String winner(String[] deckSteve, String[] deckJosh) {
        List<String> deckRang = List.of(new String[]{"2", "3", "4", "5", "6", "7", "8", "9", "T", "J", "Q", "K", "A"});
        int countSteve = 0;
        int countJosh = 0;

        for (int i = 0; i < deckSteve.length; i++) {
            if (deckRang.indexOf(deckSteve[i]) > deckRang.indexOf(deckJosh[i])) {
                countSteve++;
            } else if (deckRang.indexOf(deckSteve[i]) < deckRang.indexOf(deckJosh[i])){
                countJosh++;
            }
        }

        if (countSteve != countJosh) {
            return countSteve > countJosh ? "Steve wins " + countSteve + " to " + countJosh : "Josh wins " + countJosh + " to " + countSteve;
        }

        return "Tie";
    }
}
