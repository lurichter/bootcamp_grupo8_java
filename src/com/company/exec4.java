package com.company;

import java.util.Scanner;

public class exec4 {
    public static boolean eprimo(int valor){
        for(int i = 2; i < valor; i++){
            if(valor%i==0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Digite um número:");
        int valor = keyboard.nextInt();
        int countPrimos = 0;
        for(int i = 2; countPrimos < valor; i++){
            if(eprimo(i)){
                countPrimos++;
                System.out.println(i);
            }
        }
    }
}
