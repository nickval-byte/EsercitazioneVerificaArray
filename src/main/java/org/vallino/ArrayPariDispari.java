package org.vallino;

import java.util.Scanner;

public class ArrayPariDispari {

    static int pari;
    static int dispari;

    public static void PariDispari(int[] array){
        for (int i = 0; i < array.length; i++) {
            if (0 == array[i] % 2) pari++;
            else dispari++;
        }
    }

    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);
        int[] array = ArrayMethods.inserireArray(ui);
        pari = 0;
        dispari = 0;
        PariDispari(array);
        System.out.println("dal tuo array: " + ArrayMethods.printArray(array) + " ci sono:\n" + pari +
                " numeri pari\n" + dispari + " numeri dispari");
        ui.close();
    }
}
