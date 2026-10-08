package Atividade3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a matrícula do aluno: ");
        String matricula = input.nextLine();

        System.out.print("Digite o nome do aluno: ");
        String nome = input.nextLine();

        Aluno aluno = new Aluno(matricula, nome);

        System.out.print("Digite a primeira nota: ");
        double n1 = input.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double n2 = input.nextDouble();

        aluno.registrarNotas(n1, n2);

        System.out.print("Digite a frequência do aluno (%): ");
        double frequencia = input.nextDouble();
        aluno.atualizarFrequencia(frequencia);

        System.out.println("\n--- Dados do aluno ---");
        System.out.println("Matrícula: " + aluno.getMatricula());
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Nota 1: " + aluno.getNota1());
        System.out.println("Nota 2: " + aluno.getNota2());
        System.out.println("Média: " + aluno.calcularMedia());
        System.out.println("Frequência: " + aluno.getFrequencia() + "%");
        System.out.println("Aprovado? " + aluno.verificarAprovacao());

        input.close();
    }
}