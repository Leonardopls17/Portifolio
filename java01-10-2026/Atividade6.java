import java.util.Scanner;

public class Atividade6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double nota = -1;
        
        System.out.println("Validação de Nota");
        
        while (nota < 0.0 || nota > 10.0) {
            System.out.print("Informe uma nota entre 0,0 e 10,0: ");
            nota = scanner.nextDouble();
            
            if (nota < 0.0 || nota > 10.0) {
                System.out.println("ERRO: Nota inválida! A nota deve estar entre 0,0 e 10,0.\n");
            }
        }
        
        System.out.println("\n--- Resultado ---");
        System.out.printf("Nota: %.1f\n", nota);
        
        if (nota >= 7.0) {
            System.out.println("Situação: Aprovado");
        } else if (nota >= 5.0) {
            System.out.println("Situação: Recuperação");
        } else {
            System.out.println("Situação: Reprovado");
        }
        
        scanner.close();
    }
}
