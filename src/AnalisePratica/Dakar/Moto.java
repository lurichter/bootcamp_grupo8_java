package AnalisePratica.Dakar;

public class Moto extends Veiculo{

    public Moto(double velocidade, double aceleracao, double anguloDeGiro, String placa) {
        super(velocidade, aceleracao, anguloDeGiro, placa, 300.0, 2);
    }

    @Override
    public String toString() {
        return "Moto placa " + this.placa;
    }
}
