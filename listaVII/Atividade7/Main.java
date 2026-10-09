import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o endereço do imóvel: ");
        String endereco = input.nextLine();
        System.out.print("Digite a largura em metros: ");
        double largura = input.nextDouble();
        System.out.print("Digite o comprimento em metros: ");
        double comprimento = input.nextDouble();
        System.out.print("Digite o preço por metro quadrado: ");
        double preco = input.nextDouble();

        Imovel imovel = new Imovel(endereco, largura, comprimento, preco);

        System.out.println("\nFicha técnica:");
        imovel.exibirFichaTecnica();

        System.out.println("\nValor com preço padrão:");
        Imovel imovelPadrao = new Imovel("Rua B, 456", 12.5, 20.0);
        imovelPadrao.exibirFichaTecnica();

        input.close();
    }
}
