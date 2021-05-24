package aula2.exec11;

public class Tecnico implements Assalariado{

    private Funcionario tipo;
    private final double salario = 3200;
    private double hora = 40;
    private double bonificacao = 0.5;

    public Tecnico(boolean pj) {
        if ( pj ) this.tipo = new Pj(this.salario, this.hora);
        else this.tipo = new Clt(this.salario, this.hora, this.bonificacao);
    }
    
    public void setMetaBatida(boolean metaBatida) {
    	tipo.setMetaBatida(metaBatida);
	}

	public double pagarSalario() {
		return tipo.pagarSalario();
	}
}
