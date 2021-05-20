package com.company;

import java.util.Scanner;

public class exec2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Digite um número:");
        int n = keyboard.nextInt();
        System.out.println("Digite outro um número:");
        int m = keyboard.nextInt();
        for(int i = 1; i <= n; i++){
            System.out.println(m*i);
        }
    }
}
