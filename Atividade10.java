import java.util.Scanner;
public class Atividade10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe o peso em kg: ");
        double peso = input.nextDouble();
        System.out.println("Informe a distância em km: ");
        double distancia = input.nextDouble();
        double frete;

        if(peso <= 5){
            frete = 12;
        }else if(peso > 5 && peso <= 20){
            frete = 25;
        }else{
            frete = 50;
        }
        if(distancia > 100){
            double distanciaExcedente = distancia - 100;
            frete += distanciaExcedente * 0.20;
        }
        System.out.println("Frete total: R$ " + String.format("%.2f", frete));
        
    }
}
