import java.util.Scanner;
public class Atividade12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe o nome do usuário: ");
        String nome = input.nextLine();
        System.out.println("Informe seu cargo na empresa:");
        String cargo = input.nextLine();

        if(cargo.equalsIgnoreCase("ADMIN")) {
            System.out.println("Usuário: " + nome);
            System.out.println("Permissão: Acesso total ao sistema (Leitura, Escrita e Exclusão)");
        }       
        else if(cargo.equalsIgnoreCase("GERENTE")) {
            System.out.println("Usuário: " + nome);
            System.out.println("Permissão: Acesso intermediário (Leitura e Escrita)");
        }
        else if(cargo.equalsIgnoreCase("OPERADOR")) {
            System.out.println("Usuário: " + nome);
            System.out.println("Permissão: Acesso restrito (Apenas Leitura)");
        }
        else {
            System.out.println("Usuário: " + nome);
            System.out.println("Perfil de acesso não reconhecido");
        }
        
    }
}
