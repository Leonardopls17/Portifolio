public class Main {
   public static void main(String[] args) {

      float N1 = 30;
      float N2 = 2;
      float Soma = N1 + N2;
      float Multiplicacao = N1 * N2;
      float Divisao = N1 / N2;

      System.out.printf("A soma é: %.1f\n", Soma);
      System.out.printf("A multiplicação é: %.1f\n", Multiplicacao);
      System.out.printf("A divisão é: %.1f\n", Divisao);

      float x = -2;
      float equacaoA = 4 + 3 * x + 5 * x - 10 - x;
      float equacaoB = 5 * x - 4 * x + 10 * x - 10 * x;
      float equacaoC = 10 * x - 20 * x + 10 / x + 5 * x - 3 * x;

      System.out.printf("Equação A: 4 + 3x + 5x - 10 -x = %.2f\n", equacaoA);
      System.out.printf("Equação B: 5x - 4x + 10x - 10x = %.2f\n", equacaoB);
      System.out.printf("Equação C: 10x - 20x + 10x + 5x - 3x = %.2f\n", equacaoC);

      String[] produto = { "manga", "morango", "uva" };

      System.out.printf(produto[0]);

      float Nota1 = 10;
      float Nota2 = 5;
      float Nota3 = 8;
      float media = (Nota1 + Nota2 + Nota3) / 3;

      System.out.printf("\nA media é: %.2f", media);

   }
}
