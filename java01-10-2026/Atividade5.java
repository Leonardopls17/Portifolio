import java.util.Scanner;

public class Atividade5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double totalGasto = 0;
        int quantidade = 0;
        double despesa = 0;
        
        System.out.println("Controle de Despesas da Viagem");
        System.out.println("Digite -1 para encerrar\n");
        
        while (true) {
            System.out.print("Informe uma despesa (ou -1 para sair): ");
            despesa = scanner.nextDouble();
            
            if (despesa == -1) {
                break;
            }
            
            if (despesa < 0) {
                System.out.println("ERRO: Valores negativos não são permitidos! Tente novamente.\n");
                continue;
            }
            
            totalGasto += despesa;
            quantidade++;
        }
        
        System.out.println("\n--- Resumo das Despesas ---");
        
        if (quantidade == 0) {
            System.out.println("Nenhuma despesa foi registrada.");
        } else {
            double media = totalGasto / quantidade;
            System.out.println("Quantidade de despesas: " + quantidade);
            System.out.printf("Total gasto: R$ %.2f\n", totalGasto);
            System.out.printf("Valor médio: R$ %.2f\n", media);
        }
        
        scanner.close();
    }
}
