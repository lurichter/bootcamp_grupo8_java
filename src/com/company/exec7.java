package com.company;

public class exec7 {
    public static void main(String[] args) {

        double empresaX = 1.13;
        double empresaY = 18.4;
        int ano = 2021;

        while ( empresaX < empresaY ) {

            empresaX += empresaX * (1.48);
            empresaY += empresaY * (0.32);

            System.out.println("EmpresaX - 01/01/" + ano + " Valor da empresa: " + Math.round(empresaX) + "m");
            System.out.println("EmpresaY - 01/01/" + ano + " Valor da empresa: " + Math.round(empresaY) + "m");
            System.out.println();
            ano++;
        }

    }
}
