import java.util.Scanner;
public class Atividade9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe a sua renda mensal: ");
        double renda = input.nextDouble();
        System.out.println("Informe o valor da parcela que deseja pagar por mês: ");
        double parcela = input.nextDouble();
        System.out.println("Informe o seu score de crédito: ");
        int score = input.nextInt();

        if(score < 0 || score > 1000){
            System.out.println("Score de crédito inválido. Informe um valor entre 0 e 1000.");
        } else if (parcela > 0.30 * renda) {
            System.out.println("Solicitação negada: parcela excede 30% da renda");
        } else if (parcela < 0.30 * renda ) {
            if (score < 400) {
                System.out.println("Crédito Negado por Score Baixo");
            } else if (score >= 400 && score < 700) {
                System.out.println("Crédito Aprovado com Avalista");
            }else{
                System.out.println("Crédito Aprovado com Condições Especiais");
            }
        }
    
    }
}
