package aula2.exec11;

public class Tecnico {

    private Funcionario tipo;
    private final double salario = 3.200;
    private double hora;
    private double bonificacao;

    public Tecnico(double hora, double bonificacao, boolean pj) {
        this.hora = hora;
        this.bonificacao = bonificacao;

        if ( pj ) this.tipo = new Pj(this.salario, this.hora);
        else this.tipo = new Clt(this.salario, this.hora, this.bonificacao);
    }

    public double salarioTecnico() {
        return tipo.pagarSalario();
    }
}
