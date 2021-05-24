package aula3.exec1;

public class Pessoa implements Precedente<Pessoa>{

    String nome;
    String cpf;

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }

    @Override
    public int precedeA(Precedente<Pessoa> precedente) {

        Pessoa pessoa = (Pessoa) precedente;

        if (Long.parseLong(this.getCpf()) < Long.parseLong(pessoa.getCpf())) {
            return 1;
        } else {
            return 0;
        }

    }
}
