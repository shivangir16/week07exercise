package com.week7;
import java.util.Arrays;
import java.util.Collections;
public class week7 {
    public static void main(String[] args) {
        //Initialize array
        Integer[] intArr = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // displaying in reverse order
        System.out.println("Display array in reverse order");
        for (int i = intArr.length - 1; i >= 0; i--) {
            System.out.println(intArr[i]);
        }

        System.out.println("Sort array in ascending order");

        Arrays.sort(intArr, Collections.reverseOrder());

        for (int i = 0; i < intArr.length; i++) {
            System.out.println(intArr[i]);
        }

        System.out.println("Sort array in descending order");

        Arrays.sort(intArr);

        for (int i = 0; i < intArr.length; i++) {
            System.out.println(intArr[i]);
        }

        System.out.println("Display only ODD elements");

        for (int i = 0; i < intArr.length; i++) {
            if (i % 2 != 0)
                System.out.println(intArr[i]);
        }

        System.out.println("Display only EVEN elements");

        for (int i = 0; i < intArr.length; i++) {
            if (i % 2 == 0)
                System.out.println(intArr[i]);
        }

        System.out.println("Sum of all elements");

        int sum = 0;
        for (int i = 0; i < intArr.length; i++) {
            sum += intArr[i];
        }
        System.out.println(sum);
    }

}





