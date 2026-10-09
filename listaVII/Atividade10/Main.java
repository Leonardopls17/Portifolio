import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a marca da lâmpada: ");
        String marca = input.nextLine();

        LampadaInteligente lampada = new LampadaInteligente(marca);

        System.out.println("\nEstado inicial:");
        System.out.println("Ligada? " + lampada.isLigada());
        System.out.println("Brilho: " + lampada.getIntensidadeBrilho());
        System.out.println("Cor: " + lampada.getCorAtual());

        System.out.print("\nDeseja ligar a lâmpada? (s/n): ");
        String opcao = input.next();
        if (opcao.equalsIgnoreCase("s")) {
            lampada.ligar();
        }

        System.out.print("Digite o novo brilho (0 a 100): ");
        int brilho = input.nextInt();
        lampada.ajustarBrilho(brilho);

        System.out.print("Digite a nova cor: ");
        String cor = input.next();
        lampada.mudarCor(cor);

        System.out.println("\nEstado final:");
        System.out.println("Ligada? " + lampada.isLigada());
        System.out.println("Brilho: " + lampada.getIntensidadeBrilho());
        System.out.println("Cor: " + lampada.getCorAtual());

        input.close();
    }
}
