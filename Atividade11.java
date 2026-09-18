import java.util.Scanner;
public class Atividade11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe o Coefiente de rendimentos: ");
        double coeficiente = input.nextDouble();   
        System.out.println("Informe a sua renda familiar: ");
        double rendaFamiliar = input.nextDouble();   
        System.out.println("Informe a frequência do aluno: ");
        double frequencia = input.nextDouble();
        if(frequencia >= 75 && rendaFamiliar >= 3000){
           if( coeficiente >= 9){
            System.out.println("Bolsa concedida: 100% de desconto");
           }else if(coeficiente >= 7 && coeficiente < 9){
            System.out.println("Bolsa concedida: 50% de desconto");
            }else{
            System.out.println("Inscrição indeferida: CR insuficiente");
           }
        }else{
            System.out.println("Inscrição indeferida: requisitos não atendidos");
        }
    }
}
