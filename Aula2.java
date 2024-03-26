import java.util.Scanner;

public class Aula2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Cadastre o produto");
        String Produto = teclado.next();
        System.out.println("Informe a quantidade: ");
        int quantidade = teclado.nextInt();
        System.out.println("Informe o preço");
        float preco = teclado.nextFloat();
        teclado.close();

    }
}
