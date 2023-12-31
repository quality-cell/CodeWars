package org.example.kyu5;

public class ProductOfConsecutiveFibNumbers {
    public static long[] productFib(long prod) {
        long[] Fn = new long[100];

        for (int i = 0; i < Fn.length; i++) {
            if (i == 1 || i == 0) Fn[i] = i;
            else  Fn[i] = Fn[i - 1] + Fn[i - 2];
        }

        for (int i = 0; i < Fn.length - 1; i++) {
            long l = Fn[i] * Fn[i + 1];

            if (prod == l) return new long[] { Fn[i], Fn[i + 1], 1 };
            else if(l > prod) return new long[] { Fn[i], Fn[i + 1], 0 };
        }

        return null;
    }
}
