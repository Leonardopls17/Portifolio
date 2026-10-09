import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o título do livro: ");
        String titulo = input.nextLine();
        System.out.print("Digite o autor: ");
        String autor = input.nextLine();
        System.out.print("Digite o total de páginas: ");
        int totalPaginas = input.nextInt();

        Livro livro = new Livro(titulo, autor, totalPaginas);

        System.out.println("\nEmprestando livro...");
        System.out.println("Empréstimo realizado? " + livro.emprestar());

        System.out.println("\nAvançando páginas...");
        livro.avancarPagina();
        livro.avancarPagina();

        System.out.println("Página atual: " + livro.getPaginaAtual());
        System.out.println("Progresso: " + livro.calcularProgressoLeitura() + "%");

        System.out.println("\nDevolvendo livro...");
        livro.devolver();
        System.out.println("Emprestado? " + livro.isEmprestado());

        input.close();
    }
}
