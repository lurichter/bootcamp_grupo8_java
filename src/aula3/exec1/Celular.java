package aula3.exec1;

public class Celular implements Precedente<Celular>{
    int number;
    String holder;

    public Celular(int number, String holder) {
        this.number = number;
        this.holder = holder;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    @Override
    public String toString() {
        return "Celular{" +
                "number=" + number +
                ", holder='" + holder + '\'' +
                '}';
    }

    @Override
    public int precedeA(Precedente<Celular> precedente) {

        Celular celular = (Celular) precedente;

        if (this.getHolder().compareTo(celular.getHolder()) < 0) {
            return 1;
        } else {
            return 0;
        }
    }
}
