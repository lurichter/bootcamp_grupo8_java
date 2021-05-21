package aula2.exec5;

public class Fracao {

    private int numerador;
    private int denominador;

    public Fracao(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public void somar(int x, int y) {
        x += this.numerador;
        System.out.println("A resposta da soma é: " + x + "/" + y);
    }

    public void subtrair(int x, int y) {
        x -= this.numerador;
        System.out.println("A resposta da subtração é: " + x + "/" + y);
    }

    public void multiplicar(int x, int y) {
        x *= this.numerador;
        y *= this.denominador;
        System.out.println("A resposta da multiplicação é: " + x + "/" + y);
    }

    public void dividir(int x, int y) {

        int numerador = this.numerador * y;
        int denominador = this.denominador * x;

        System.out.println("O resultado da divisão é: " + numerador + "/" + denominador);
    }
}
