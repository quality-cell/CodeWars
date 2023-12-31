package org.example.kyu5;

import java.util.regex.Pattern;

public class SimplePigLatin {
    public static String pigIt(String str) {
        String[] arrayStr = str.split(" ");
        str = "";

        for (int i = 0; i < arrayStr.length; i++) {
            String tmp = arrayStr[i].substring(0, 1);

            if (Pattern.compile("^[A-Za-z]+$").matcher(arrayStr[i]).matches()){
                str += i == arrayStr.length - 1 ? arrayStr[i].substring(1) + tmp + "ay" : arrayStr[i].substring(1) + tmp + "ay ";
            } else {
                str += arrayStr[i];
            }
        }

        return str;
    }
}
