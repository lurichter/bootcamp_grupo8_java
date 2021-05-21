package aula2.exec2;

public class Main {
    public static void main(String [] args){
        ContaCorrente c1 = new ContaCorrente(20.0);
        System.out.println(c1);
        c1.deposito(10.5);
        System.out.println(c1);
        c1.saque(5.5);
        System.out.println(c1);

        ContaCorrente c2 = new ContaCorrente(100.0);
        System.out.println(c2);

        c1.transfere(c2, 30.0);
        System.out.println();
        System.out.println(c1);
        System.out.println(c2);

    }
}
