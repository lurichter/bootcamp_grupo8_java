package aula2.exec9;

public class Retangulo extends GeometricFigure {

    private double base;
    private double altura;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double area() {
        return this.base * this.altura;
    }
}
