package org.example.kyu6;

public class ConvertStringToCamelCase {
    public static String toCamelCase(String s){
        String[] sArray = s.split("-|_");

        for (int i = 1; i < sArray.length; i++) {
            char[] sChar = sArray[i].toCharArray();

            sChar[0] = Character.toUpperCase(sChar[0]);
            sArray[i] = new String(sChar);
        }

        return String.join("", sArray);
    }
}
