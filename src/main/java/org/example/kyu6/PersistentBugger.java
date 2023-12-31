package org.example.kyu6;

class PersistentBugger {
    /**
     * This method counts how many times the multiplication operation was performed to produce a digit.
     *
     * @param n number to be converted to digit
     * @return number of repetitions
     */
    public static int persistence(long n) {
        int[] intArray = Integer.toString((int) n).chars().map(c -> c-'0').toArray();
        int num;
        int count = 0;

        if (intArray.length > 1) {
            do{
                num = mathOperation(intArray);
                intArray = Integer.toString(num).chars().map(c -> c-'0').toArray();
                count++;
            } while (num / 10 != 0);
        }

        return count;
    }

    /**
     * This method finds the product of the digits of a number
     *
     * @param intArray numeric array in which you need to find the product of digits
     * @return product of numbers
     */
    private static int mathOperation(int[] intArray) {
        int num = 1;

        for (int j : intArray) {
            num *= j;
        }

        return num;
    }
}