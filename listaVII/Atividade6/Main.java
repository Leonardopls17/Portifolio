import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o CPF: ");
        String cpf = input.nextLine();
        System.out.print("Digite o nome: ");
        String nome = input.nextLine();
        System.out.print("Digite o peso em kg: ");
        double peso = input.nextDouble();
        System.out.print("Digite a altura em metros: ");
        double altura = input.nextDouble();

        Paciente paciente = new Paciente(cpf, nome, peso, altura);

        System.out.println("\nPaciente: " + paciente.getNome());
        System.out.println("IMC: " + paciente.calcularIMC());
        System.out.println("Classificação: " + paciente.classificarIMC());

        System.out.print("\nDigite o novo peso: ");
        double novoPeso = input.nextDouble();
        paciente.atualizarPeso(novoPeso);

        System.out.println("Novo IMC: " + paciente.calcularIMC());
        System.out.println("Nova classificação: " + paciente.classificarIMC());

        input.close();
    }
}
