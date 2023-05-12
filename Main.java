package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Task1
        int[] arr = {3, 6, 4, 7, 2, 1,9};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int x = sc.nextInt();
        System.out.println(setArray(arr, x));

        //Task2
        int s = 0;
        for (int i = 0; i < arr.length; i++){
            s = s +(arr[i] * arr[i]);
            }
        System.out.println("The sum of array: " + s);
    }

    public static String setArray(int[] arr, int x){
        for (int i = arr.length-1; i > -1; i--) {
            if (arr[i] == x) {
                return "Index of your number is: " + i;
            }
        }
        return "Your number is out of the array.";
    }
}