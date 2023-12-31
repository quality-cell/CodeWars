package org.example.kyu6;

import java.util.ArrayList;
import java.util.Arrays;
import com.google.common.primitives.Ints;

public class ArrayDiff {

    public static int[] arrayDiff(int[] a, int[] b) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        Arrays.sort(b);

        for (int j : a) {
            if (Arrays.binarySearch(b, j) >= 0) {
                continue;
            }

            res.add(j);
        }

        return  Ints.toArray(res);
    }
}
