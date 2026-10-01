import java.util.Scanner;

public class Atividade7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        
        do {
            System.out.println("\n--- Menu de Conversões ---");
            System.out.println("1 - Converter metros para centímetros");
            System.out.println("2 - Converter quilômetros para metros");
            System.out.println("3 - Converter graus Celsius para Fahrenheit");
            System.out.println("0 - Encerrar");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            
            switch (opcao) {
                case 1:
                    System.out.print("Informe o valor em metros: ");
                    double metros = scanner.nextDouble();
                    double centimetros = metros * 100;
                    System.out.printf("%.2f metros = %.2f centímetros\n", metros, centimetros);
                    break;
                
                case 2:
                    System.out.print("Informe o valor em quilômetros: ");
                    double quilometros = scanner.nextDouble();
                    double metrosConvertidos = quilometros * 1000;
                    System.out.printf("%.2f quilômetros = %.2f metros\n", quilometros, metrosConvertidos);
                    break;
                
                case 3:
                    System.out.print("Informe a temperatura em graus Celsius: ");
                    double celsius = scanner.nextDouble();
                    double fahrenheit = (1.8 * celsius) + 32;
                    System.out.printf("%.2f °C = %.2f °F\n", celsius, fahrenheit);
                    break;
                
                case 0:
                    System.out.println("Programa encerrado!");
                    break;
                
                default:
                    System.out.println("ERRO: Opção inválida! Escolha uma opção entre 0 e 3.");
                    break;
            }
        } while (opcao != 0);
        
        scanner.close();
    }
}
