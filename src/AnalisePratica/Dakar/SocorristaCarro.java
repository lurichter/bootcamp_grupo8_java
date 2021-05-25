package AnalisePratica.Dakar;

public class SocorristaCarro implements Socorrista{

    @Override
    public void socorrer(Veiculo veiculo) {
        System.out.println("Socorrendo " + veiculo);
    }
}
