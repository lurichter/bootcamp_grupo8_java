package aula2.exec6;

public class Main {
    public static void main(String[] args) {

        Data data = new Data("21/05/2021");
        System.out.println(data);
        data.addDay();
        System.out.println(data);
        Data data2 = new Data("32/05/2021");
    }
}
