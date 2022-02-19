package biblioteca;
import java.util.ArrayList;
import java.util.List;


public class Biblioteca {
    private final List<Livro> livros = new ArrayList<>();

    public void cadastraLivro(Livro livro) {
        livros.add(livro);
    }

    public List<Livro> pesquisaLivroPorTitulo(String titulo) {

        List<Livro> livrosEncontrados = new ArrayList<>();

        for (Livro livro : livros) {
           if (livro.getTitulo().contains(titulo))
               livrosEncontrados.add(livro);
        }
        return livrosEncontrados;
    }

}
