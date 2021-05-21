package aula2.exec2;

public class ContaCorrente {
    private int id;
    static int contador = 0;
    private double saldo;

    private void init(){
        this.id = ++contador;
    }

    public ContaCorrente(double saldo) {
        init();
        this.saldo = saldo;
    }

    public ContaCorrente(ContaCorrente contaCorrente){
        init();
        this.saldo = contaCorrente.getSaldo();
    }

    public void deposito(double valor){
       this.saldo += valor;
    }

    public void saque(double valor){
        if(valor > this.saldo){
            System.out.println("Saldo insuficiente");
        }
        else{
            this.saldo -= valor;
            System.out.println("Saque efetuado");
        }
    }

    public void transfere(ContaCorrente destino, double valor){
        if(valor > this.saldo){
            System.out.println("Saldo insuficiente");
        }
        else{
            this.saldo -= valor;
            destino.saldo += valor;
            System.out.println("Transferencia efetuada");
        }
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "ContaCorrente{" +
                "id=" + id +
                ", saldo=" + saldo +
                '}';
    }
}
