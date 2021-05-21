package aula1;

import java.util.ArrayList;
import java.util.Arrays;

public class exec9 {

    static int iArr[] = { 16223, 898, 13, 906, 235, 23, 9, 1532, 6388, 2511, 8, 100 };
    static String arrString[] = new String[iArr.length];

    static ArrayList<String> L0 = new ArrayList<>();
    static ArrayList<String> L1 = new ArrayList<>();
    static ArrayList<String> L2 = new ArrayList<>();
    static ArrayList<String> L3 = new ArrayList<>();
    static ArrayList<String> L4 = new ArrayList<>();
    static ArrayList<String> L5 = new ArrayList<>();
    static ArrayList<String> L6 = new ArrayList<>();
    static ArrayList<String> L7 = new ArrayList<>();
    static ArrayList<String> L8 = new ArrayList<>();
    static ArrayList<String> L9 = new ArrayList<>();

    static ArrayList<String> listaFinal = new ArrayList<>();
    
    static int maiorCaractere = maiorCaracteres(iArr);

    
    public static void main(String[] args) {
        radixSort();
    }

    public static int maiorCaracteres(int iArr[]) {
        int maior = 0;

        for ( int i = 0; i < iArr.length; i++ ) {

            String element = String.valueOf(iArr[i]);

            maior = Math.max(maior, element.length());

        }
        return maior;
    }

    public static void radixSort() {

        igualaArrays(iArr);
        
        listaFinal.addAll(Arrays.asList(arrString));

        int digitoIteracao = maiorCaractere;

        while ( digitoIteracao > 0 ) {
            radixIteracao(digitoIteracao);
            digitoIteracao--;
        }

        System.out.println(listaFinal);
    }

    public static void radixIteracao (int digitoIteracao) {
    	ArrayList<String> array = new ArrayList<String>();
    	array.addAll(listaFinal);
    	
        limpaListas();

        for (String num : array) {
            atribuiLista(num, pegaElementoChave(num, digitoIteracao));
        }
        listaResultante();

    }

    public static void limpaListas() {
    	L0.clear();
        L1.clear();
        L2.clear();
        L3.clear();
        L4.clear();
        L5.clear();
        L6.clear();
        L7.clear();
        L8.clear();
        L9.clear();
        listaFinal.clear();
    }

    public static String[] igualaArrays(int iArr[]) {

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

    public static String pegaElementoChave(String digito, int index) {
        return Character.toString(digito.charAt(index - 1));
    }

    public static void atribuiLista(String digito, String digitoChave) {
        if (digitoChave.equals("0")) L0.add(digito);
        if (digitoChave.equals("1")) L1.add(digito);
        if (digitoChave.equals("2")) L2.add(digito);
        if (digitoChave.equals("3")) L3.add(digito);
        if (digitoChave.equals("4")) L4.add(digito);
        if (digitoChave.equals("5")) L5.add(digito);
        if (digitoChave.equals("6")) L6.add(digito);
        if (digitoChave.equals("7")) L7.add(digito);
        if (digitoChave.equals("8")) L8.add(digito);
        if (digitoChave.equals("9")) L9.add(digito);
    }

    public static void listaResultante() {
        listaFinal.addAll(L0);
        listaFinal.addAll(L1);
        listaFinal.addAll(L2);
        listaFinal.addAll(L3);
        listaFinal.addAll(L4);
        listaFinal.addAll(L5);
        listaFinal.addAll(L6);
        listaFinal.addAll(L7);
        listaFinal.addAll(L8);
        listaFinal.addAll(L9);
    }

}
