package AnalisePratica.Dakar;

public class SocorristaMoto implements Socorrista{

    @Override
    public void socorrer(Veiculo veiculo) {
        System.out.println("Socorrendo " + veiculo);
    }
}
