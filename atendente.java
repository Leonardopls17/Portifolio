import java.util.Scanner;

public class atendente {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.printf("1 opção - O saldo da conta\n");
        System.out.printf("2 opção - Nome de cadastro\n");
        System.out.printf("3 opção - Transferir para o atendente\n");
        System.out.printf("Digite o número da opção desejada: ");
        int opcao = teclado.nextInt();

        if(opcao == 1){
            System.out.printf("O saldo da conta é 5000");
        }
        if(opcao == 2){
            System.out.printf("O usuário cadastrado é Lucas Almeida");
        }
        if(opcao == 3){
            System.out.printf("Transferindo para o atendente");
        }
        teclado.close();
    }
}
