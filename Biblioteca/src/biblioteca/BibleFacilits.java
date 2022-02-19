package biblioteca;
import java.util.List;
import java.util.Scanner;

public class BibleFacilits {
    static Biblioteca biblioteca = new Biblioteca();

    public static void exibeMenu() {
        System.out.println("===========================================");
        System.out.println("BEM VINDO(A) À SUA BIBLIOTECA.");
        System.out.println("Digite 1 para NOVO LIVRO.");
        System.out.println("Digite 2 para CONSULTAR LIVROS.");
        System.out.println("Digite 0 para SAIR.");
        System.out.println("===========================================");
    }

    public static int escolheOpcaoMenu() {
        exibeMenu();
        Scanner numero = new Scanner(System.in);
        int escolha =  numero.nextInt();
        acionaOpcaoDesejada(escolha);
        return escolha;
    }

    private static void acionaOpcaoDesejada(int escolha) {
        Scanner texto = new Scanner(System.in);
        Scanner numero = new Scanner(System.in);

        switch (escolha) {
            case 1:
                System.out.println("===========================================");
                System.out.println("Digite o nome do livro: ");
                String nomeLivro = texto.nextLine();
                System.out.println("Digite o nome do autor: ");
                String nomeAutor = texto.nextLine();
                System.out.println("Digite o nome da editora: ");
                String nomeEditora = texto.nextLine();
                System.out.println("Digite o numero de páginas: ");
                Integer numPaginas = numero.nextInt();
                Livro livro = new Livro(nomeLivro, nomeAutor, nomeEditora, numPaginas);
                biblioteca.cadastraLivro(livro);
                System.out.println("===========================================");
                break;
            case 2:
                System.out.println("===========================================");
                System.out.println("Digite o nome do título a ser pesquisado: ");
                String titulo = texto.nextLine();
                System.out.println("===========================================");
                List<Livro> livros = biblioteca.pesquisaLivroPorTitulo(titulo);
                if (livros.isEmpty()) {
                    System.out.println("===========================================");
                    System.out.println("Título não encontrado!");
                    System.out.println("============================================");
                } else {
                    exibeLivrosEncontrados(livros);
                }
                break;
            case 0:
                System.out.println("\nVocê saiu do programa");
                break;
            default:
                System.out.println("Você digitou uma opção inválida.");
                break;
        }
    }

    private static void exibeLivrosEncontrados(List<Livro> livros) {
        for (Livro livro : livros) {
            System.out.println("___________________________________________");
            System.out.println(livro);
            System.out.println("\n___________________________________________");
        }
    }
}
