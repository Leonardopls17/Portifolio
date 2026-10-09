public class Imovel {
    private String endereco;
    private double largura;
    private double comprimento;
    private double precoPorMetroQuadrado;

    public Imovel(String endereco, double largura, double comprimento, double precoPorMetroQuadrado) {
        this.endereco = endereco;
        this.largura = largura;
        this.comprimento = comprimento;
        this.precoPorMetroQuadrado = precoPorMetroQuadrado;
    }

    public Imovel(String endereco, double largura, double comprimento) {
        this(endereco, largura, comprimento, 1000.0);
    }

    public double calcularAreaTotal() {
        return largura * comprimento;
    }

    public double calcularValorEstimado() {
        return calcularAreaTotal() * precoPorMetroQuadrado;
    }

    public void exibirFichaTecnica() {
        System.out.println("Endereço: " + endereco);
        System.out.println("Área total: " + calcularAreaTotal() + " m²");
        System.out.println("Valor estimado: " + calcularValorEstimado());
    }

    public String getEndereco() {
        return endereco;
    }

    public double getLargura() {
        return largura;
    }

    public double getComprimento() {
        return comprimento;
    }

    public double getPrecoPorMetroQuadrado() {
        return precoPorMetroQuadrado;
    }
}
