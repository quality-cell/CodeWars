package org.example.kyu6;

import java.util.Arrays;

public class CreatePhoneNumber {
    public static String createPhoneNumber(int[] numbers) {
        String res = Arrays.toString(numbers).replaceAll("\\p{Punct}", "").replaceAll(" ","");

        return String.format("(%s) %s-%s", res.substring(0, 3), res.substring(3, 6), res.substring(6, 10));
    }
}
