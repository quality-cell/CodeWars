package org.example.kyu6;

public class SumOfDigits {
    public static int digital_root(int n) {
        int sum = 0;

        do {
            sum = (sum + n % 10 > 9) ? digital_root(sum + n % 10) : sum + n % 10;
            n = n / 10;
        } while (n != 0);

        return sum;
    }
}
