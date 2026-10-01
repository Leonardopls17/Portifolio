import java.util.Scanner;
public class Atividade3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Informe um número inteiro positivo N: ");
        int n = scanner.nextInt();
        
        if (n <= 0) {
            System.out.println("ERRO: O número deve ser positivo!");
            scanner.close();
            return;
        }
        
        int soma = 0;
        int contador = 0;
        
        System.out.println("Números pares entre 1 e " + n + ":");
        for (int i = 2; i <= n; i += 2) {
            System.out.print(i + " ");
            soma += i;
            contador++;
        }
        
        System.out.println("\n\nSoma dos números pares: " + soma);
        System.out.println("Quantidade de números pares: " + contador);
        
        scanner.close();
    }
}
