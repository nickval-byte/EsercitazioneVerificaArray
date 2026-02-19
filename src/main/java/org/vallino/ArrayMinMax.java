package org.vallino;

import java.util.Scanner;

public class ArrayMinMax {

    static int min;
    static int max;

    public static void minMax(int[] array){
        min = array[0];
        max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) min = array[i];
            if (max < array[i]) max = array[i];
        }
    }

    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);
        int[] array = ArrayMethods.inserireArray(ui);
        minMax(array);
        System.out.println("dal tuo array: " + ArrayMethods.printArray(array) + "\nil numero più grande è: "
        + max + "\nil numero più piccolo è: " + min);
        ui.close();
    }
}
