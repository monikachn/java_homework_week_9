package homework_week_9;

import java.util.Arrays;

/**
 * Write a Java program to reverse an array of integer values.
 */
public class P3_ReverseArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9,};
        System.out.println("Original  array" + Arrays.toString(arr) );
        for (int i = 0; i < arr.length; i++) {
           // System.out.println(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Array in reverse  order");
        //Loop through the array in reverse order
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
            {

            }

        }

    }
}