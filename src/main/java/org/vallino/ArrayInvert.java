package org.vallino;

import java.util.Scanner;

public class ArrayInvert {

    public static int[] inverter(int[] array){
        int[] arrayInv = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arrayInv[i] = array[array.length-1-i];
        }
        return arrayInv;
    }

    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);
        int[] array = ArrayMethods.inserireArray(ui);
        int[] arrayInv = inverter(array);
        System.out.println("il tuo array è: " + ArrayMethods.printArray(array) +
                "\nil tuo array invertito è: " + ArrayMethods.printArray(arrayInv));
        ui.close();
    }
}
