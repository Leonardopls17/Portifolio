import java.util.Scanner;
public class Atividade8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe a temperatura em Celsius: ");
        double celsius = input.nextDouble();
        double kelvin = celsius + 273.15;
        double rankine = (celsius + -273.15) * 1.8;
        if (celsius < -273.15) {
            System.out.println("Temperatura inválida: abaixo do zero absoluto" );
        }else{
            System.out.println("Temperatura em Kelvin: " + kelvin);
            System.out.println("Temperatura em Rankine: " + rankine);
        }
    }
}
