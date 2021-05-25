package AnalisePratica.Dakar;

public class Carro extends Veiculo{

    public Carro(double velocidade, double aceleracao, double anguloDeGiro, String placa) {
            super(velocidade, aceleracao, anguloDeGiro, placa, 1000.0, 4);
    }

    @Override
    public String toString() {
        return "Carro placa " + this.placa;
    }
}
