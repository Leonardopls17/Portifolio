import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Receber dois números reais
        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();
        
        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();
        
        // Apresentar o menu de opções
        System.out.println("\n=== MENU DE OPERAÇÕES ===");
        System.out.println("1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.print("\nEscolha uma operação (1-4): ");
        int opcao = scanner.nextInt();
        
        double resultado = 0;
        
        // Switch case para executar a operação escolhida
        switch (opcao) {
            case 1:
                resultado = numero1 + numero2;
                System.out.printf("\n%.2f + %.2f = %.2f%n", numero1, numero2, resultado);
                break;
                
            case 2:
                resultado = numero1 - numero2;
                System.out.printf("\n%.2f - %.2f = %.2f%n", numero1, numero2, resultado);
                break;
                
            case 3:
                resultado = numero1 * numero2;
                System.out.printf("\n%.2f × %.2f = %.2f%n", numero1, numero2, resultado);
                break;
                
            case 4:
                // Validar divisão por zero
                if (numero2 == 0) {
                    System.out.println("\nERRO: Divisão por zero não é permitida!");
                } else {
                    resultado = numero1 / numero2;
                    System.out.printf("\n%.2f ÷ %.2f = %.2f%n", numero1, numero2, resultado);
                }
                break;
                
            default:
                System.out.println("\nERRO: Opção inválida! Escolha uma operação entre 1 e 4.");
                break;
        }
        
        scanner.close();
    }
}
