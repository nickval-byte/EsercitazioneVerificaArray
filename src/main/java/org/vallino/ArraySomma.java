package org.vallino;

import java.util.Scanner;

public class ArraySomma {

    public static int sommaArray(int[] array){
        int somma = 0;
        for (int i : array) {
            somma += i;
        }
        return somma;
    }

    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);
        int[] array = ArrayMethods.inserireArray(ui);
        ui.close();
        System.out.println("la somma dei valori inseriti è: " + sommaArray(array));
        ui.close();
    }
}
