import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("1 - motocicleta, R$ 3,00 | 2 - automóvel, R$ 5,00 | 3 - utilitário, R$ 8,00");
            System.out.print("\nInforme a categoria do veículo: ");
            int categoria = scanner.nextInt();

            System.out.print("Informe a quantidade de horas inteiras: ");
            double horas = scanner.nextDouble();
            if (horas < 0) {
                System.out.println("\nERRO: Quantidade de horas inválida! Informe um valor maior ou igual a zero.");
                return;
            } else {

                switch (categoria) {
                    case 1:
                        System.out.printf("\nPreço a pagar: R$ %.2f", horas * 3.00);
                        break;
                    case 2:
                        System.out.printf("\nPreço a pagar: R$ %.2f", horas * 5.00);
                        break;
                    case 3:
                        System.out.printf("\nPreço a pagar: R$ %.2f", horas * 8.00);
                        break;
                    default:
                        System.out.println("\nERRO: Categoria inválida! Escolha uma categoria entre 1 e 3.");
                        break;
                }
            }
        }
    }
}
