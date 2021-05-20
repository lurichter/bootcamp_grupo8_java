package com.company;

import java.util.Arrays;

public class exec9 {

    static int iArr[] = { 16223, 898, 13, 906, 235, 23, 9, 1532, 6388, 2511, 8, 100 };
    static String[] L0 = new String[iArr.length];
    static String[] L1 = new String[iArr.length];
    static String[] L2 = new String[iArr.length];
    static String[] L3 = new String[iArr.length];
    static String[] L4 = new String[iArr.length];
    static String[] L5 = new String[iArr.length];
    static String[] L6 = new String[iArr.length];
    static String[] L7 = new String[iArr.length];
    static String[] L8 = new String[iArr.length];
    static String[] L9 = new String[iArr.length];


    public static void main(String[] args) {

        radixSort(iArr);
    }

    public static int maiorCaracteres(int iArr[]) {
        int maior = 0;

        // converter p/ string
        for ( int i = 0; i < iArr.length; i++ ) {

            String element = String.valueOf(iArr[i]);

            maior = Math.max(maior, element.length());

        }
        return maior;
    }

    public static void radixSort(int[] iArr) {

        System.out.println(Arrays.toString(igualaArrays(iArr)));


    }

    public static String[] igualaArrays(int iArr[]) {
        int maiorCaractere = maiorCaracteres(iArr);
        String arrString[] = new String[iArr.length];

        for ( int i = 0; i < iArr.length; i++) {

            String element = String.valueOf(iArr[i]);
            int quantidadeDeZeros = maiorCaractere - element.length();

            while ( quantidadeDeZeros > 0 ) {
                element = "0" + element;
                quantidadeDeZeros--;
            }

            arrString[i] =  element;
        }
        return arrString;
    }

    public static String descobreUltimoNumero(String digito) {
        return Character.toString(digito.charAt(digito.length() - 1));
    }

    public static void atribuiLista(String digito) {

    }
}
