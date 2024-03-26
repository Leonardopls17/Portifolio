package Atividade;
import java.util.Scanner;

public class Nome {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.printf("Digite seu nome: ");
        String Nome = teclado.next();
        System.out.printf("Seja bem vindo %s!!", Nome);
    }
}
