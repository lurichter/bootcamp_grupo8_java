package aula2.exec4;

public class Book {
    private String titulo;
    private Integer isbn;
    private String autor;
    private String status = "disponível";

    public Book(String titulo, Integer isbn, String autor) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
    }

    public void emprestimo(){
        if (this.status.toLowerCase().equals("emprestado")){
            System.out.println("O livro já está emprestado");
        }
        else{
            this.status = "emprestado";
            System.out.println("O emprestimo do livro " + this.titulo + " foi realizado.");
        }
    }

    public void devolver(){
        if(this.status.toLowerCase().equals("disponível")){
            System.out.println("O livro já se encontra disponível");
        }
        else{
            this.status = "disponível";
            System.out.println("O livro " + this.titulo + " foi devolvido");
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getIsbn() {
        return isbn;
    }

    public void setIsbn(Integer isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Book{" +
                "titulo='" + titulo + '\'' +
                ", isbn=" + isbn +
                ", autor='" + autor + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
