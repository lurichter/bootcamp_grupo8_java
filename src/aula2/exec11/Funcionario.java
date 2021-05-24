package aula2.exec11;

public abstract class Funcionario implements Assalariado{

    private double salario;
    private double hora;
    private boolean metaBatida;

    public Funcionario(double salario, double hora) {
        this.salario = salario;
        this.hora = hora;
    }

    public abstract double pagarSalario();
    
    public void setMetaBatida(boolean metaBatida) {
    	this.metaBatida = metaBatida;
    }

    public double getHora() {
        return hora;
    }

    public void setHora(double hora) {
        this.hora = hora;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }


	public boolean isMetaBatida() {
		return metaBatida;
	}

}
