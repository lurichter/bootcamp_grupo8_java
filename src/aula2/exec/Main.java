package aula2.exec;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Harry Potter e o Cálice de Fogo",12345, "J.K.Rolling");
        System.out.println(book);
        book.emprestimo();
        System.out.println(book);
        book.devolver();
        System.out.println(book);
    }
}
