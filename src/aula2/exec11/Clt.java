package aula2.exec11;

public class Clt extends Funcionario {

    private boolean meta = false;
    private double bonificacao;

    Clt(double salario, double hora, double bonificacao) {
        super(salario, hora);

        this.bonificacao = bonificacao;
    }

    public void bateuMeta() {
        this.meta = true;
    }

    public double pagarSalario() {
        if (this.meta) return (getSalario() * this.bonificacao);

        return getSalario();
    }
}
