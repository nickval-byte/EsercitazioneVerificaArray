package org.vallino;

import java.util.Scanner;

public class ArrayMedia {

    public static double media(int[] array){
        int somma = 0;
        for (int i : array) {
            somma += i;
        }
        return (double) somma / array.length;
    }

    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);
        int[] array = ArrayMethods.inserireArray(ui);
        double media = media(array);
        System.out.println("dal tuo array: " + ArrayMethods.printArray(array) + "la media è: " + media);
    }
}
