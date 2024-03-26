import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.printf("Digite o primeiro número: ");
        float N1 = keyboard.nextFloat();
        System.out.printf("Digite o segundo número: ");
        float N2 = keyboard.nextFloat();

        float Soma = N1 + N2;
        float Subtracao = N1 - N2;
        float Multiplicacao = N1 * N2;
        float Divisao = N1 / N2;

        System.out.printf("Primeiro Número: %.2f\n", N1);
        System.out.printf("Segundo Número: %.2f\n", N2);
        System.out.printf("Soma: %.2f\n", Soma);
        System.out.printf("Subtração: %.2f\n", Subtracao);
        System.out.printf("Multiplicação: %.2f\n", Multiplicacao);
        System.out.printf("Divisão: %.2f\n", Divisao);
        keyboard.close();

    }
}
