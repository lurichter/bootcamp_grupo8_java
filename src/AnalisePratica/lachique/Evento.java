package AnalisePratica.lachique;

import java.util.List;

public class Evento {

    private List<Convidados> convidados;
    private List<FogosArtificios> fogosArtificios;

    public Evento(List<Convidados> convidados, List<FogosArtificios> fogosArtificios) {
        this.convidados = convidados;
        this.fogosArtificios = fogosArtificios;
    }

    public void apagarVela() {
        System.out.println("Velas apagando.....");

        // explodir fogos
        this.estourarFogosArtificios();

        // distribui bolo
        this.distribuirBolo();
    }

    public void estourarFogosArtificios () {
        for ( FogosArtificios fa : fogosArtificios ) {
            System.out.println(fa.barulhoFogoDeArtificio());
        }
    }

    public void distribuirBolo() {
        System.out.println("Distribuindo pedaco de bolo.....");

        convidados.forEach(Convidados::comerBolo);
    }
}
