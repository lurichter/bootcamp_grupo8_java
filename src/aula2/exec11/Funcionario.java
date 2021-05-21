package aula2.exec11;

public abstract class Funcionario {

    private double salario;
    private double hora;

    public Funcionario(double salario, double hora) {
        this.salario = salario;
        this.hora = hora;
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

    public abstract double pagarSalario();
}
