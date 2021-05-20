package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class exec8 {
    public static void main(String[] args) {
        HashMap<Integer, Produto> produtos = new HashMap<>();

        String nome;
        double preco;
        int quantidade;

        for ( int i = 1; i < 3; i++ ) {
            Scanner keyboard = new Scanner(System.in);

            System.out.println("Digite o NOME do produto");
            nome = keyboard.nextLine();

            System.out.println("Digite o PREÇO do produto");
            preco = keyboard.nextDouble();

            System.out.println("Digite o QUANTIDADE do produto");
            quantidade = keyboard.nextInt();

            produtos.put(i, new Produto(i, nome, preco, quantidade));
        }

        System.out.println();

        for ( Produto produto: produtos.values() ) {
            System.out.println(produto);
        }
    }

    private static class Produto {
        private int id;
        private String nome;
        private double preco;
        private int quantidade;

        public Produto(int id, String nome, double preco, int quantidade) {
            this.id = id;
            this.nome = nome;
            this.preco = preco;
            this.quantidade = quantidade;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public double getPreco() {
            return preco;
        }

        public void setPreco(double preco) {
            this.preco = preco;
        }

        public int getQuantidade() {
            return quantidade;
        }

        public void setQuantidade(int quantidade) {
            this.quantidade = quantidade;
        }

        @Override
        public String toString() {
            return "Produto " + id + '\n' +
                    "" + nome + '\n' +
                    "R$ " + preco + '\n' +
                    "Quantidade: " + quantidade + '\n';
        }
    }
}

