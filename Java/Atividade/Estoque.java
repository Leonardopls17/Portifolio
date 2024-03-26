package Atividade;
import java.util.Scanner;

public class Estoque {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.printf("Digite o nome do Produto A:");
        String NomeProdutoA = teclado.next();
        System.out.printf("Digite a quantidade vendida no mês 1: ");
        int Mes1ProdutoA = teclado.nextInt();
        System.out.printf("Digite a quantidade vendida no mês 2: ");
        int Mes2ProdutoA = teclado.nextInt();
        System.out.printf("Digite a quantidade vendida no mês 3: ");
        int Mes3ProdutoA = teclado.nextInt();
        System.out.printf("Digite a quantidade vendida no mês 4: ");
        int Mes4ProdutoA = teclado.nextInt();
        System.out.printf("Digite o tempo de reposição do produto A: ");
        float trProdutoA = teclado.nextFloat();
        System.out.printf("Digite o lote de reposição do produto A: ");
        float lrProdutoA = teclado.nextFloat();
        System.out.printf("Digite o estoque atual do produto A: ");
        float eaProdutoA = teclado.nextFloat();

        float vmdProdutoA = ((Mes1ProdutoA + Mes2ProdutoA + Mes3ProdutoA + Mes4ProdutoA) / 3) / 25;
        float eminProdutoA = (trProdutoA * vmdProdutoA);
        float emaxProdutoA = (lrProdutoA + eminProdutoA);

        System.out.printf("Nome do Produto A: %s\n", NomeProdutoA);
        System.out.printf("Venda média diária: %.2f\n", vmdProdutoA);
        System.out.printf("Estoque mínimo: %.2f\n", eminProdutoA);
        System.out.printf("Estoque maxímo: %.2f\n", emaxProdutoA);
        if (eaProdutoA < eminProdutoA) {
            System.out.printf("Necessário reposição!\n");
        } else {
            System.out.printf("Desnecessário reposição!\n");
        }

        System.out.printf("Digite o nome do Produto B:");
        String NomeProdutoB = teclado.next();
        System.out.printf("Digite a quantidade vendida no mês 1: ");
        int Mes1ProdutoB = teclado.nextInt();
        System.out.printf("Digite a quantidade vendida no mês 2: ");
        int Mes2ProdutoB = teclado.nextInt();
        System.out.printf("Digite a quantidade vendida no mês 3: ");
        int Mes3ProdutoB = teclado.nextInt();
        System.out.printf("Digite a quantidade vendida no mês 4: ");
        int Mes4ProdutoB = teclado.nextInt();
        System.out.printf("Digite o tempo de reposição do produto B: ");
        float trProdutoB = teclado.nextFloat();
        System.out.printf("Digite o lote de reposição do produto B: ");
        float lrProdutoB = teclado.nextFloat();
        System.out.printf("Digite o estoque atual do produto B: ");
        float eaProdutoB = teclado.nextFloat();

        float vmdProdutoB = ((Mes1ProdutoB + Mes2ProdutoB + Mes3ProdutoB + Mes4ProdutoB) / 3) / 25;
        float eminProdutoB = (trProdutoB * vmdProdutoB);
        float emaxProdutoB = (lrProdutoB + eminProdutoB);

        System.out.printf("Nome do Produto B: %s\n", NomeProdutoB);
        System.out.printf("Venda média diária do produto B: %.2f\n", vmdProdutoB);
        System.out.printf("Estoque mínimo do produto B: %.2f\n", eminProdutoB);
        System.out.printf("Estoque maxímo do produto B: %.2f\n", emaxProdutoB);
        if (eaProdutoB < eminProdutoB) {
            System.out.printf("Necessário reposição!\n");
        } else {
            System.out.printf("Desnecessário reposição!\n");
        }

        System.out.printf("Digite o nome do Produto C:");
        String NomeProdutoC = teclado.next();
        System.out.printf("Digite a quantidade vendida no mês 1: ");
        int Mes1ProdutoC = teclado.nextInt();
        System.out.printf("Digite a quantidade vendida no mês 2: ");
        int Mes2ProdutoC = teclado.nextInt();
        System.out.printf("Digite a quantidade vendida no mês 3: ");
        int Mes3ProdutoC = teclado.nextInt();
        System.out.printf("Digite a quantidade vendida no mês 4: ");
        int Mes4ProdutoC = teclado.nextInt();
        System.out.printf("Digite o tempo de reposição do produto C: ");
        float trProdutoC = teclado.nextFloat();
        System.out.printf("Digite o lote de reposição do produto C: ");
        float lrProdutoC = teclado.nextFloat();
        System.out.printf("Digite o estoque atual do produto C: ");
        float eaProdutoC = teclado.nextFloat();

        float vmdProdutoC = ((Mes1ProdutoC + Mes2ProdutoC + Mes3ProdutoC + Mes4ProdutoC) / 3) / 25;
        float eminProdutoC = (trProdutoC * vmdProdutoC);
        float emaxProdutoC = (lrProdutoC + eminProdutoC);

        System.out.printf("Nome do Produto C: %s\n", NomeProdutoC);
        System.out.printf("Venda média diária do produto C: %.2f\n", vmdProdutoC);
        System.out.printf("Estoque mínimo do produto C: %.2f\n", eminProdutoC);
        System.out.printf("Estoque maxímo do produto C: %.2f\n", emaxProdutoC);
        if (eaProdutoC < eminProdutoC) {
            System.out.printf("Necessário reposição!\n");
        } else {
            System.out.printf("Desnecessário reposição!\n");
        }

        teclado.close();
    }
}
