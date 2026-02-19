package org.vallino;

import java.util.Scanner;

public class ArraySorting {

    public static void sorting(int[] array){
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-1-i; j++) {
                if (array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    System.out.println(ArrayMethods.printArray(array)); //print ogni spostamento
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);
        int[] array = ArrayMethods.inserireArray(ui);
        int[] arrayCopy = array.clone();
        sorting(array);
        System.out.println("il tuo array era: " + ArrayMethods.printArray(arrayCopy) + "\nil tuo array in ordine è: " + ArrayMethods.printArray(array));
        ui.close();
    }
}
