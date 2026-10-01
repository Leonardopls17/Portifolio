import java.util.Scanner;
public class Atividade4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Informe a quantidade de pessoas: ");
        int quantidade = scanner.nextInt();
        
        if (quantidade <= 0) {
            System.out.println("ERRO: A quantidade deve ser um número inteiro positivo!");
            scanner.close();
            return;
        }
        
        double[] alturas = new double[quantidade];
        double somaAlturas = 0;
        double maiorAltura = 0;
        int contadorAlto = 0;
        
        for (int i = 0; i < quantidade; i++) {
            System.out.print("Informe a altura da pessoa " + (i + 1) + " (em metros): ");
            double altura = scanner.nextDouble();
            
            alturas[i] = altura;
            somaAlturas += altura;
            
            if (altura > maiorAltura) {
                maiorAltura = altura;
            }
            
            if (altura > 1.70) {
                contadorAlto++;
            }
        }
        
        double mediaAlturas = somaAlturas / quantidade;
        
        System.out.println("\n--- Resultados ---");
        System.out.printf("Média das alturas: %.2f m\n", mediaAlturas);
        System.out.printf("Maior altura: %.2f m\n", maiorAltura);
        System.out.println("Quantidade de pessoas com altura superior a 1,70 m: " + contadorAlto);
        
        scanner.close();
    }
}
