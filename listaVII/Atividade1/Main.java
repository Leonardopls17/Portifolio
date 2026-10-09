import java.util.Scanner;;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== BANCO ===");
        System.out.print("Digite o número da conta: ");
        String numeroConta = input.nextLine();

        System.out.print("Digite o nome do titular: ");
        String titular = input.nextLine();

        ContaBancaria conta = new ContaBancaria(numeroConta, titular);

        System.out.println("\nConta criada com sucesso!");
        System.out.println("Número: " + conta.getNumeroConta());
        System.out.println("Titular: " + conta.getTitular());
        System.out.println("Saldo inicial: " + conta.consultarSaldo());

        System.out.print("\nDigite o valor do depósito: ");
        double valorDeposito = input.nextDouble();
        conta.depositar(valorDeposito);

        System.out.println("Saldo após depósito: " + conta.consultarSaldo());

        System.out.print("Digite o valor do saque: ");
        double valorSaque = input.nextDouble();

        if (conta.sacar(valorSaque)) {
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Não foi possível realizar o saque.");
        }

        System.out.println("Saldo final: " + conta.consultarSaldo());
        System.out.println("Conta ativa? " + conta.isAtiva());

        input.close();
    }
}