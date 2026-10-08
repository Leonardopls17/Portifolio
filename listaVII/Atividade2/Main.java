package Atividade2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o código do produto: ");
        int codigo = input.nextInt();
        input.nextLine();

        System.out.print("Digite o nome do produto: ");
        String nome = input.nextLine();

        System.out.print("Digite o preço do produto: ");
        double preco = input.nextDouble();

        Produto produto = new Produto(codigo, nome, preco);

        System.out.print("Digite a quantidade que deseja adicionar ao estoque: ");
        int qtdAdicionar = input.nextInt();
        produto.adicionarEstoque(qtdAdicionar);

        System.out.print("Digite a quantidade que deseja remover do estoque: ");
        int qtdRemover = input.nextInt();
        if (produto.removerEstoque(qtdRemover)) {
            System.out.println("Remoção realizada com sucesso!");
        } else {
            System.out.println("Quantidade inválida para remoção.");
        }

        System.out.print("Digite o percentual de desconto: ");
        double percentual = input.nextDouble();
        produto.aplicarDesconto(percentual);

        System.out.println("\nResumo do produto:");
        System.out.println("Código: " + produto.getCodigo());
        System.out.println("Nome: " + produto.getNome());
        System.out.println("Preço final: " + produto.getPreco());
        System.out.println("Quantidade em estoque: " + produto.getQuantidadeEstoque());
        System.out.println("Valor total do estoque: " + produto.calcularValorTotalEstoque());

        input.close();
    }
}
