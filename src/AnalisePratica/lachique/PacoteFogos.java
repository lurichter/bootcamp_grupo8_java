package AnalisePratica.lachique;

import java.util.ArrayList;
import java.util.List;

public class PacoteFogos extends FogosArtificios {

    private final String nome = "Pacote de Fogos";
    private List<FogosArtificios> fogosArtificios = new ArrayList<>();

    public List<FogosArtificios> getFogosArtificios() {
        return fogosArtificios;
    }

    public void setFogosArtificios(List<FogosArtificios> fogosArtificios) {
        this.fogosArtificios = fogosArtificios;
    }

    @Override
    public String barulhoFogoDeArtificio() {

        fogosArtificios.forEach(fogosArtificio -> {
            System.out.println(fogosArtificio.barulhoFogoDeArtificio());
        });

        return "";
    }
}
