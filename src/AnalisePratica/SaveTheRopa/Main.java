package AnalisePratica.SaveTheRopa;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Vestuario vestuario1 = new Vestuario("Hering", "Camiseta Básica");
        Vestuario vestuario2 = new Vestuario("Nike", "Calça Futebol Treino");
        Vestuario vestuario3 = new Vestuario("Levi's", "Calça Jeans 501 42 40");

        List listaVestuario = new ArrayList<Vestuario>();
        listaVestuario.add(vestuario1);
        listaVestuario.add(vestuario2);
        listaVestuario.add(vestuario3);

        GuardaRoupa guardaRoupa = new GuardaRoupa();
        guardaRoupa.guardarVestuario(listaVestuario);
        guardaRoupa.mostrarVestuarios();

        Vestuario vestuario4 = new Vestuario("Renner", "Vestido Florido");
        Vestuario vestuario5 = new Vestuario("Armani", "Terno Italiano Cinza");
        Vestuario vestuario6 = new Vestuario("Adidas", "Short Azul Running");

        List listaVestuario2 = new ArrayList<Vestuario>();
        listaVestuario2.add(vestuario4);
        listaVestuario2.add(vestuario5);
        listaVestuario2.add(vestuario6);

        guardaRoupa.guardarVestuario(listaVestuario2);
        guardaRoupa.mostrarVestuarios();

        guardaRoupa.devolverVestuarios(2);

        guardaRoupa.mostrarVestuarios();

    }
}
