import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o nome do personagem: ");
        String nome = input.nextLine();
        System.out.print("Digite os pontos de vida: ");
        int vida = input.nextInt();
        System.out.print("Digite os pontos de ataque: ");
        int ataque = input.nextInt();

        PersonagemJogo personagem = new PersonagemJogo(nome, vida, ataque);

        System.out.println("\nStatus inicial:");
        System.out.println("Nome: " + personagem.getNome());
        System.out.println("Nível: " + personagem.getNivel());
        System.out.println("Vida: " + personagem.getPontosVida());
        System.out.println("Ataque: " + personagem.getPontosAtaque());

        System.out.print("\nQuanto de dano receber? ");
        int dano = input.nextInt();
        personagem.receberDano(dano);

        System.out.print("Quantos pontos deseja curar? ");
        int cura = input.nextInt();
        personagem.curar(cura);

        personagem.subirDeNivel();

        System.out.println("\nStatus final:");
        System.out.println("Nível: " + personagem.getNivel());
        System.out.println("Vida: " + personagem.getPontosVida());
        System.out.println("Ataque: " + personagem.getPontosAtaque());
        System.out.println("Está vivo? " + personagem.isEstaVivo());

        input.close();
    }
}
