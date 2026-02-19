package org.vallino;

import java.util.Scanner;

public class ArrayMethods {
    public static int[] inserireArray(Scanner ui) {
        System.out.println("inserire grandezza array:");
        int[] temp = new int[ui.nextInt()];
        for (int i = 0; i < temp.length; i++) {
            System.out.println("inserire valore " + (i + 1) + ":");
            temp[i] = ui.nextInt();
        }
        return temp;
    }

    public static String printArray(int[] array) {
        String text = "[";
        for (int i = 0; i < array.length; i++) {
            if (i != array.length - 1) text += array[i] + ", ";
            else text += array[i] + "]";
        }
        return text;
    }
}
