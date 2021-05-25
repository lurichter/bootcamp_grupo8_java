package AnalisePratica.lachique;

public abstract class Convidados {

    private String nome;

    public Convidados(String nome) {
        this.nome = nome;
    }

    public abstract void comerBolo();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
