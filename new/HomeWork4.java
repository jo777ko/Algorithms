package de.telran.algorithms;

public class HomeWork4 {
    public static void main(String[] args) {
        System.out.println(getSumOfOnes(1415));

    }

    public static int getSumOfOnes(int number) {
        int size = (int) (Math.log(number) / Math.log(2));

        int[] arr = new int[size + 1];
        int rest = 0;
        int dev = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            number -= (dev + rest);
            rest = number % 2;
            dev = number >> 1;  // == dev = number / 2;

            if (rest == 0) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }

        int sum = 0;
        for (Integer num : arr
        ) {
            sum += num;
        }
        return sum;
    }
}
