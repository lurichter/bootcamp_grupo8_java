package aula3.exec1;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa("Lucas", "38232091835");
        Pessoa pessoa2 = new Pessoa("João", "38232091836");
        Pessoa pessoa3 = new Pessoa("Rafael", "38232091834");

        Pessoa[] lista = new Pessoa[3];
        lista[0] = pessoa1;
        lista[1] = pessoa2;
        lista[2] = pessoa3;

        System.out.println(Arrays.toString(lista));

        sortUtil listaOrdenada = new sortUtil();
        sortUtil.sort(lista);

        System.out.println(Arrays.toString(lista));

        Celular celular1 = new Celular(11111111, "B");
        Celular celular2 = new Celular(22222222, "C");
        Celular celular3 = new Celular(33333333, "A");

        Celular[] listaCelular = new Celular[3];
        listaCelular[0] = celular1;
        listaCelular[1] = celular2;
        listaCelular[2] = celular3;

        System.out.println(Arrays.toString(listaCelular));

        sortUtil listaCelularOrdenada = new sortUtil();
        sortUtil.sort(listaCelular);

        System.out.println(Arrays.toString(listaCelular));


    }
}
