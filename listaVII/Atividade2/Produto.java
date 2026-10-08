package Atividade2;

public class Produto {
    private int codigo;
    private String nome;
    private double preco;
    private int quantidadeEstoque;

    public Produto(int codigo, String nome, double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = 0;
    }

    public void adicionarEstoque(int qtd) {
        if (qtd > 0) {
            quantidadeEstoque += qtd;
        }
    }

    public boolean removerEstoque(int qtd) {
        if (qtd > 0 && qtd <= quantidadeEstoque) {
            quantidadeEstoque -= qtd;
            return true;
        }
        return false;
    }

    public void aplicarDesconto(double percentual) {
        if (percentual > 0) {
            preco = preco * (1 - (percentual / 100));
        }
    }

    public double calcularValorTotalEstoque() {
        return preco * quantidadeEstoque;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }
}
