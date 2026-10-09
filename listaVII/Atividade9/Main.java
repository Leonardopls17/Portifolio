import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o nome do funcionário: ");
        String nome = input.nextLine();
        System.out.print("Digite o cargo: ");
        String cargo = input.nextLine();
        System.out.print("Digite o salário base: ");
        double salarioBase = input.nextDouble();

        Funcionario funcionario = new Funcionario(nome, cargo, salarioBase);

        System.out.print("Digite a quantidade de horas extras: ");
        int horasExtras = input.nextInt();
        funcionario.adicionarHorasExtras(horasExtras);

        System.out.print("Digite o valor da hora extra: ");
        double valorHoraExtra = input.nextDouble();

        System.out.println("\nCargo atual: " + funcionario.getCargo());
        System.out.println("Salário líquido: " + funcionario.calcularSalarioLiquido(valorHoraExtra));

        System.out.print("\nDigite o novo cargo: ");
        String novoCargo = input.next();
        System.out.print("Digite o novo salário base: ");
        double novoSalario = input.nextDouble();
        funcionario.promover(novoCargo, novoSalario);

        System.out.println("Novo cargo: " + funcionario.getCargo());
        System.out.println("Novo salário base: " + funcionario.getSalarioBase());

        input.close();
    }
}
