public class Livro {
    private String titulo;
    private Autor autor;
    private long isbn;

    public Livro() { }

    public Livro(String titulo, Autor autor, long isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return this.autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public long getIsbn() {
        return this.isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "---" +
                "\nLivro:" +
                "\ntitulo = " + this.titulo +
                "\n" + this.autor +
                "\nisbn = " + this.isbn;
    }
}
