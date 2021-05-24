package aula2.exec11;

public class Pj extends Funcionario {

    Pj(double salario, double hora) {
        super(salario, hora);
    }

	@Override
	public double pagarSalario() {
		return getSalario() * getHora();
	}

}
