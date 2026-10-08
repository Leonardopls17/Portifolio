package Atividade3;

public class Aluno {
    private String matricula;
    private String nome;
    private double nota1;
    private double nota2;
    private double frequencia;

    public Aluno(String matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
        this.nota1 = 0.0;
        this.nota2 = 0.0;
        this.frequencia = 100.0;
    }

    public void registrarNotas(double n1, double n2) {
        if (n1 >= 0 && n1 <= 10) {
            this.nota1 = n1;
        }
        if (n2 >= 0 && n2 <= 10) {
            this.nota2 = n2;
        }
    }

    public void atualizarFrequencia(double novaFrequencia) {
        if (novaFrequencia >= 0 && novaFrequencia <= 100) {
            this.frequencia = novaFrequencia;
        }
    }

    public double calcularMedia() {
        return (nota1 + nota2) / 2;
    }

    public boolean verificarAprovacao() {
        return calcularMedia() >= 7.0 && frequencia >= 75.0;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public double getNota1() {
        return nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public double getFrequencia() {
        return frequencia;
    }
}
