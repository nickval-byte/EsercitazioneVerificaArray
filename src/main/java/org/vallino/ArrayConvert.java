package org.vallino;

import java.util.Scanner;

public class ArrayConvert {

    public static Integer[] toInteger(int[] array){
        Integer[] arrayInteger = new Integer[array.length];
        for (int i = 0; i < array.length; i++) {
            arrayInteger[i] = array[i];
        }
        return arrayInteger;
    }

    public static String[] convertToString(Integer[] array){
        String[] text = new String[array.length];
        for (int i = 0; i < array.length; i++) {
            text[i] = Integer.toString(array[i]);
        }
        return text;
    }

    private static String printStringArray(String[] array) {
        String text = "[";
        for (int i = 0; i < array.length; i++) {
            if (array.length-1 != i) text += array[i] + ", ";
            else text += array[i] + "]";
        }
        return text;
    }

    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);
        int[] array = ArrayMethods.inserireArray(ui);
        System.out.println(printStringArray(convertToString(toInteger(array))));
        ui.close();
    }
}
