import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a marca do carro: ");
        String marca = input.nextLine();

        System.out.print("Digite o modelo do carro: ");
        String modelo = input.nextLine();

        System.out.print("Digite o ano do carro: ");
        int ano = input.nextInt();

        Carro carro = new Carro(marca, modelo, ano);

        System.out.println("\nCarro criado com sucesso!");
        System.out.println("Marca: " + carro.getMarca());
        System.out.println("Modelo: " + carro.getModelo());
        System.out.println("Ano: " + carro.getAno());
        System.out.println("Motor ligado? " + carro.isMotorLigado());
        System.out.println("Velocidade atual: " + carro.getVelocidadeAtual() + " km/h");

        System.out.print("\nDeseja ligar o motor? (s/n): ");
        String opcao = input.next();
        if (opcao.equalsIgnoreCase("s")) {
            carro.ligarMotor();
            System.out.println("Motor ligado.");
        }

        System.out.print("Digite o valor a acelerar (km/h): ");
        double incremento = input.nextDouble();
        carro.acelerar(incremento);

        System.out.print("Digite o valor a frear (km/h): ");
        double decremento = input.nextDouble();
        carro.frear(decremento);

        System.out.print("Deseja desligar o motor? (s/n): ");
        String desligar = input.next();
        if (desligar.equalsIgnoreCase("s") && carro.getVelocidadeAtual() == 0) {
            carro.desligarMotor();
            System.out.println("Motor desligado.");
        } else if (desligar.equalsIgnoreCase("s")) {
            System.out.println("Não foi possível desligar o motor porque a velocidade não está em zero.");
        }

        System.out.println("\nResumo final:");
        System.out.println("Motor ligado? " + carro.isMotorLigado());
        System.out.println("Velocidade atual: " + carro.getVelocidadeAtual() + " km/h");

        input.close();
    }
}
