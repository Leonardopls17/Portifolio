import java.util.Scanner;
public class Atividade13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe o valor total da compra : ");
        double valorTotal = input.nextDouble();
        System.out.println("PIX");
        System.out.println("DEBITO");
        System.out.println("CREDITO");
        System.out.println("Informe a forma de pagameto: ");
        String formaPagamento = input.next();
        
        if(formaPagamento.equalsIgnoreCase("PIX")){
            double desconto = valorTotal * 0.10;
            System.out.println("Valor total da compra com desconto: R$ " + String.format("%.2f", (valorTotal - desconto)));
        }else if(formaPagamento.equalsIgnoreCase("DEBITO")){
            double desconto = valorTotal * 0.05;
            System.out.println("Valor total da compra com desconto: R$ " + String.format("%.2f", (valorTotal - desconto)));
        }else if(formaPagamento.equalsIgnoreCase("CREDITO")){
            
            System.out.println("Valor total da compra: R$ " + String.format("%.2f", valorTotal));
        }else{
            System.out.println("Forma de pagamento inválida.");
        }
       
    }
}
