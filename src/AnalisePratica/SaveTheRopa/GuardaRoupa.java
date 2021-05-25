package AnalisePratica.SaveTheRopa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GuardaRoupa {
    private static Integer contador = 0;
    private Map<Integer, List<Vestuario>> vestuariosGuardados = new HashMap<>();

    public Integer guardarVestuario(List<Vestuario> listaDeVestuario) {
        contador++;
        this.vestuariosGuardados.put(contador, listaDeVestuario);
        return contador;
    }

    public void mostrarVestuarios() {
        for (Map.Entry<Integer, List<Vestuario>> entrada : this.vestuariosGuardados.entrySet()) {
            System.out.println("Guarda Roupa " + entrada.getKey() + " contém " + entrada.getValue());
        }
    }

    public List<Vestuario> devolverVestuarios(Integer id) {
        List vestuariosDevolvidos = new ArrayList<Vestuario>();
        vestuariosDevolvidos = this.vestuariosGuardados.remove(id);
        System.out.println("Devolvendo vestuários do Guarda Roupa número " + id + " ...");
        System.out.println("Itens devolvidos: " + vestuariosDevolvidos);
        return vestuariosDevolvidos;
    }
}
