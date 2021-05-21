package aula2.exec9;

public class Main {
    public static void main(String[] args) {
        Circulo c = new Circulo(20);
        System.out.println(c.area());

        Retangulo r = new Retangulo(4, 5);
        System.out.println(r.area());

        Triangulo t = new Triangulo(4, 5);
        System.out.println(t.area());

        GeometricFigure arr[] = {c, r, t};

        Utils u = new Utils();
        System.out.println("Resultado: " + u.areaMedia(arr));

    }
}
