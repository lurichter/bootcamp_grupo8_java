package aula2.exec11;

public class Clt extends Funcionario {

    private double bonificacao;

    Clt(double salario, double hora, double bonificacao) {
        super(salario, hora);
        this.bonificacao = bonificacao;
    }

    @Override
    public double pagarSalario() {
        if (super.isMetaBatida()) return (getSalario() + (getSalario() * this.bonificacao));
        return getSalario();
    }
}
