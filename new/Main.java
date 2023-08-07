package de.telran;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();

        main.returnMax();

        main.isPalindrome("dog");
        main.isPalindrome("noon");

    }

    int returnMax(){
        Scanner console = new Scanner(System.in);
        int[] array = new int[5];
        for (int i = 0; i < 5; i++) {
            array[i] = console.nextInt();
        }

        int max = array[0];

        for (int i = 1; i < 5; i++) {
            if (array[i] > max)
                max = array[i];
        }
        return max;
    }

    void isPalindrome(String word){

        char[] chars = new StringBuilder(word).reverse().toString()
                .toCharArray();

        String reverseWord = new String(chars);

        if (word.equalsIgnoreCase(reverseWord)){
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
