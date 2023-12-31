package org.example.kyu6;

import java.util.Arrays;

public class EqualSidesOfAnArray {
    public static int findEvenIndex(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int right = Arrays.stream(Arrays.copyOfRange(arr, i + 1, arr.length)).sum();
            int left = Arrays.stream(Arrays.copyOfRange(arr, 0, i)).sum();

            if (right == left) {
                return i;
            }
        }

        return -1;
    }
}
