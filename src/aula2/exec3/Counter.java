package aula2.exec3;

public class Counter {
    private int counter;

    public Counter() {
        this.counter = counter;
    }

    public Counter(int counter){
        this.counter = counter;
    }

    public Counter(Counter counter){
        this.counter = this.getCounter();
    }

    public void increment(){
        this.counter += 1;
    }

    public void decrement(){
       this.counter -= 1;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    @Override
    public String toString() {
        return "Counter{" +
                "counter=" + counter +
                '}';
    }

}
