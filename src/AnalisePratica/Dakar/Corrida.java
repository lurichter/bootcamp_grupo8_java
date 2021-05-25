package AnalisePratica.Dakar;

import java.util.ArrayList;
import java.util.List;

public class Corrida {

    private double distancia;
    private double premioEmDolares;
    private String nome;
    private int quantidadeVeiculosPermitidos;
    private List<Veiculo> listaVeiculos;
    private SocorristaMoto socorristaMoto = new SocorristaMoto();
    private SocorristaCarro socorristaCarro = new SocorristaCarro();

    public Corrida(double distancia, double premioEmDolares, String nome, int quantidadeVeiculosPermitidos, List<Veiculo> listaVeiculos) {
        this.distancia = distancia;
        this.premioEmDolares = premioEmDolares;
        this.nome = nome;
        this.quantidadeVeiculosPermitidos = quantidadeVeiculosPermitidos;
        this.listaVeiculos = listaVeiculos;
    }

    public Corrida(double distancia, double premioEmDolares, String nome, int quantidadeVeiculosPermitidos) {
        this.distancia = distancia;
        this.premioEmDolares = premioEmDolares;
        this.nome = nome;
        this.quantidadeVeiculosPermitidos = quantidadeVeiculosPermitidos;
        this.listaVeiculos = new ArrayList<Veiculo>();
    }

    public void registrarCarro(Carro carro) {
        if (this.listaVeiculos.size() < this.quantidadeVeiculosPermitidos) {
            this.listaVeiculos.add(carro);
            System.out.println("Veículo " + carro + " adicionado à corrida " + this.nome);
        } else {
            System.out.println("Corrida já possui o número máximo de veículos");
        }
    }

    public void registrarMoto(Moto moto) {
        if (this.listaVeiculos.size() < this.quantidadeVeiculosPermitidos) {
            this.listaVeiculos.add(moto);
            System.out.println("Veículo " + moto + " adicionada à corrida " + this.nome);
        } else {
            System.out.println("Corrida já possui o número máximo de veículos");
        }
    }

    public void removerVeiculo(Veiculo veiculo) {
        if (this.listaVeiculos.contains(veiculo)) {
            this.listaVeiculos.remove(veiculo);
            System.out.println("Veículo " + veiculo + " removido da corrida " + this.nome);
        } else {
            System.out.println("Veículo " + veiculo + " não está registrado na corrida " + this.nome);
        }
    }

    public void removerVeiculoPorPlaca(String placa) {

        Veiculo veiculoARemover = null;

        for (Veiculo veiculo : this.listaVeiculos) {
            if (veiculo.getPlaca() == placa) {
                veiculoARemover = veiculo;
            }
        }

        if (veiculoARemover != null) {
            this.listaVeiculos.remove(veiculoARemover);
            System.out.println("Veículo com placa " + veiculoARemover.getPlaca() + " removido da corrida " + this.nome);
        } else {
            System.out.println("Veículo com placa " + placa + " não está registrado na corrida " + this.nome);
        }
    }

    public void vencedorCorrida(){
        double valorTemp = 0;
        double valorVencedor = 0;
        Veiculo vencedor = null;

        if (this.listaVeiculos.size() == 0) {
            System.out.println("Corrida " + this.nome + " não possui veículos");
        } else {
            for (Veiculo veiculo : this.listaVeiculos) {
                valorTemp = veiculo.getVelocidade() * veiculo.getAceleracao() /
                            (veiculo.getAnguloDeGiro() * (veiculo.getPeso() - veiculo.getRodas() * 100));
                if (valorTemp >valorVencedor) {
                    valorVencedor = valorTemp;
                    vencedor = veiculo;
                }
            }
            System.out.println("O veículo com placa " + vencedor.getPlaca() + " é o vencedor da corrida " + this.nome);
        }

    }

    public void socorrerCarro(String placa) {

        Veiculo carroASocorrer = null;

        for (Veiculo veiculo : this.listaVeiculos) {
            if (veiculo.getPlaca() == placa && veiculo.getClass() == Carro.class ) {
                carroASocorrer = veiculo;
            }
        }

        if (carroASocorrer != null) {
            this.socorristaCarro.socorrer(carroASocorrer);
        } else {
            System.out.println("Carro com placa " + placa + " não está registrado na corrida " + this.nome);
        }
    }

    public void socorrerMoto(String placa) {

        Veiculo motoASocorrer = null;

        for (Veiculo veiculo : this.listaVeiculos) {
            if (veiculo.getPlaca() == placa && veiculo.getClass() == Moto.class ) {
                motoASocorrer = veiculo;
            }
        }

        if (motoASocorrer != null) {
            this.socorristaCarro.socorrer(motoASocorrer);
        } else {
            System.out.println("Moto com placa " + placa + " não está registrado na corrida " + this.nome);
        }
    }

    @Override
    public String toString() {
        return "Corrida{" +
                "distancia=" + distancia +
                ", premioEmDolares=" + premioEmDolares +
                ", nome='" + nome + '\'' +
                ", quantidadeVeiculosPermitidos=" + quantidadeVeiculosPermitidos +
                ", listaVeiculos=" + listaVeiculos +
                '}';
    }
}
