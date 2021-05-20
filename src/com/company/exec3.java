package com.company;

import java.util.Scanner;

public class exec3 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Digite um número:");
        int valor = keyboard.nextInt();
        for(int i = 2; i < valor; i++){
            if(valor%i==0) {
                System.out.println("Não é primo");
                return;
            }
        }
        System.out.println("É primo");
    }
}
