package aula2.exec9;

public class Circulo extends GeometricFigure {

    private double raio;
    private final double PI = 3.14;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double area() {
        return PI * (raio * raio);
    }
}