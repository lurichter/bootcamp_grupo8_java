package com.company;

import java.util.Scanner;

public class exec5 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Digite um limite:");
        int range = keyboard.nextInt();
        System.out.println("Digite um número de ocorrencias:");
        int ocorr = keyboard.nextInt();
        System.out.println("Digite o numero que deseja:");
        int num = keyboard.nextInt();
        int countPrint = 0;
        for(int numAtual = 0; countPrint < range; numAtual++){
            String numString = Integer.toString(numAtual);
            int numOcorr = 0;
            for(int j=0; j < numString.length(); j++){
                String charAtual = Character.toString(numString.charAt(j));
                if(Integer.parseInt(charAtual) == num) {
                    numOcorr++;
                }
            }
            if(numOcorr == ocorr){
                System.out.println(numAtual);
                countPrint++;
            }
        }
    }
}
