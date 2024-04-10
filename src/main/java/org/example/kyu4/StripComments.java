package org.example.kyu4;

import java.util.List;

public class StripComments {
    public static String stripComments(String text, String[] commentSymbols) {
        List<String> escapeSequences = List.of(new String[]{"\t", "\b", "\n", "\r", "\f", "\'", "\"", "\\"});
        String[] lines;
        String escapeSequence = "";

        for (String i : escapeSequences) {
            if (text.contains(i)) {
                escapeSequence = i;
                break;
            }
        }

        if (!escapeSequence.isEmpty()) {
            lines = text.split(escapeSequence);
        } else {
            lines = text.split("\n");
            escapeSequence = "\n";
        }

        for (int j = 0; j < lines.length; j++) {
            for (String x : commentSymbols) {
                if (lines[j].contains(x)) {
                    lines[j] = lines[j].substring(0, lines[j].indexOf(x)).stripTrailing();
                    break;
                }

                lines[j] = lines[j].stripTrailing();
            }
        }

        text = String.join(escapeSequence, lines);

        return text;
    }
}
