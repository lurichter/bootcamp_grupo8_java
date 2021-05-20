package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class exec6 {
    public static void main(String[] args) {
        Integer[] array = {52, 10, 85, 1324, 01, 13, 62, 30, 12, 127};
        ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(array));

        System.out.println("Array");
        System.out.println();

        orderAsc(array);
        System.out.println(Arrays.toString(array));

        orderDesc(array);
        System.out.println(Arrays.toString(array));

        System.out.println();
        System.out.println("ArrayList");
        System.out.println();

        Collections.sort(arr);
        System.out.println(arr);

        Collections.sort(arr, Collections.reverseOrder());
        System.out.println(arr);


    }
    public static void orderDesc(Integer vetor[]){
        boolean troca = true;
        Integer aux;
        while (troca) {
            troca = false;
            for (int i = 0; i < vetor.length - 1; i++) {
                if (vetor[i] < vetor[i + 1]) {
                    aux = vetor[i];
                    vetor[i] = vetor[i + 1];
                    vetor[i + 1] = aux;
                    troca = true;
                }
            }
        }
    }
    public static void orderAsc(Integer vetor[]){
        boolean troca = true;
        Integer aux;
        while (troca) {
            troca = false;
            for (int i = 0; i < vetor.length - 1; i++) {
                if (vetor[i] > vetor[i + 1]) {
                    aux = vetor[i];
                    vetor[i] = vetor[i + 1];
                    vetor[i + 1] = aux;
                    troca = true;
                }
            }
        }
    }
}

