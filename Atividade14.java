import java.util.Scanner;
public class Atividade14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe a sigla do estado: ");
        String sigla = input.nextLine();

        if(sigla.equalsIgnoreCase("BA") || sigla.equalsIgnoreCase("PE") || sigla.equalsIgnoreCase("CE")) {
            System.out.println("Região Nordeste");
        }
        else if(sigla.equalsIgnoreCase("SP") || sigla.equalsIgnoreCase("RJ") || sigla.equalsIgnoreCase("MG")) {
            System.out.println("Região Sudeste");
        }
        else if(sigla.equalsIgnoreCase("PR") || sigla.equalsIgnoreCase("RS") || sigla.equalsIgnoreCase("SC")) {
            System.out.println("Região Sul");
        }
        else {
            System.out.println("Estado pertencente a outra região ou sigla não cadastrada");
        }

        input.close();
    }
}
