package AnalisePratica.lachique;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Convidados> convidados = new ArrayList<>();
        List<FogosArtificios> fogosArtificios = new ArrayList<>();

        Rojao rojao = new Rojao();
        Bomba bomba = new Bomba();
        PacoteFogos pacoteFogos = new PacoteFogos();
        PacoteFogos pacoteFogos2 = new PacoteFogos();

        Meli meli = new Meli("Victor");
        Meli meli2 = new Meli("Lucas");
        Meli meli3 = new Meli("Ste");
        Meli meli4 = new Meli("Gabriel");
        Meli meli5 = new Meli("Ismael");

        Standard standard = new Standard("Joao");
        Standard standard2 = new Standard("Maria");
        Standard standard3 = new Standard("Jose");
        Standard standard4 = new Standard("Pedro");

        pacoteFogos.getFogosArtificios().addAll(Arrays.asList(rojao, bomba, bomba, rojao, rojao, bomba, rojao));
        pacoteFogos2.getFogosArtificios().addAll(Arrays.asList(rojao, bomba, bomba, rojao, rojao, bomba, rojao));
        pacoteFogos2.getFogosArtificios().add(pacoteFogos);

        convidados.addAll(Arrays.asList(meli, meli2, meli3, meli4, meli5, standard, standard2, standard3, standard4));

        fogosArtificios.addAll(Arrays.asList(rojao, bomba, bomba, rojao, rojao, bomba, rojao, pacoteFogos2));

        Evento evento = new Evento(convidados, fogosArtificios);

        evento.apagarVela();
    }
}
