import java.util.Scanner;
public class Atividade15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe o nome do aluno: ");
        String nome = input.nextLine();
        System.out.println("Informe o turno de estudo (M, V ou N): ");
        String turno = input.nextLine();

        if(turno.equalsIgnoreCase("M") || turno.equalsIgnoreCase("MATUTINO")) {
            System.out.println("Bom dia, " + nome + "!");
        }
        else if(turno.equalsIgnoreCase("V") || turno.equalsIgnoreCase("VESPERTINO")) {
            System.out.println("Boa tarde, " + nome + "!");
        }
        else if(turno.equalsIgnoreCase("N") || turno.equalsIgnoreCase("NOTURNO")) {
            System.out.println("Boa noite, " + nome + "!");
        }
        else {
            System.out.println("Turno de estudo inválido");
        }

        input.close();
    }
}
