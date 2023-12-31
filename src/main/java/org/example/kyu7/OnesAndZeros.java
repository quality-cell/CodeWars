package org.example.kyu7;

import java.util.List;
import java.util.stream.Collectors;

public class OnesAndZeros {
    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        return Integer.parseInt(binary.stream().map(String::valueOf).collect(Collectors.joining()), 2);
    }
}
