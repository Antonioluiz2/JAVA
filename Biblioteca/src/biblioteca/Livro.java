package biblioteca;

public class Livro {
    private String titulo;
    private String autor;
    private String editora;
    private Integer numPaginas;

    public Livro(String titulo, String autor, String editora, Integer numPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.numPaginas = numPaginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getEditora() {
        return editora;
    }

    public Integer getNumPaginas() {
        return numPaginas;
    }

    @Override
    public String toString() {
        return  "Titulo: " + titulo + "\n" +
                "Autor: " + autor + "\n" +
                "Editora: " + editora + "\n" +
                "Número de páginas: " + numPaginas;
    }

}
