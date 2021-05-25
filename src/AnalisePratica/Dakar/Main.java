package AnalisePratica.Dakar;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Carro carro1 = new Carro(100.0,10.0, 45.0,"ABC1234");
        Carro carro2 = new Carro(80.0,14.0, 47.0,"DEF5678");
        Moto moto1 = new Moto(100.0,10.0, 45.0,"HIJ9101");
        Moto moto2 = new Moto(80.0,14.0, 47.0,"KLM1121");

        List listaVeiculos = new ArrayList();
        listaVeiculos.add(carro1);
        listaVeiculos.add(moto1);

        Corrida corrida = new Corrida(100000.0, 10000.0, "Paris Dakar", 10, listaVeiculos);

        System.out.println(corrida);

        corrida.registrarCarro(carro2);
        corrida.registrarMoto(moto2);

        System.out.println(corrida);

        corrida.removerVeiculo(carro2);
        corrida.removerVeiculoPorPlaca("KLM1121");

        System.out.println(corrida);

        corrida.registrarCarro(carro2);

        corrida.removerVeiculo(moto2);
        corrida.removerVeiculoPorPlaca("ABC1111");

        corrida.registrarMoto(moto2);

        System.out.println(corrida);

        corrida.socorrerCarro("ABC1234");
        corrida.socorrerMoto("DEF5678");

        corrida.vencedorCorrida();

    }
}
