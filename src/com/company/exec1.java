package com.company;

import java.util.Scanner;

public class exec1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Digite um número:");
        int valor = keyboard.nextInt();
        for(int i = 1; i <= valor*2; i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}
