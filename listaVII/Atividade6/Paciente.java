public class Paciente {
    private String cpf;
    private String nome;
    private double peso;
    private double altura;

    public Paciente(String cpf, String nome, double peso, double altura) {
        this.cpf = cpf;
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
    }

    public double calcularIMC() {
        return peso / (altura * altura);
    }

    public String classificarIMC() {
        double imc = calcularIMC();

        if (imc < 18.5) {
            return "Abaixo do peso";
        } else if (imc >= 18.5 && imc < 25.0) {
            return "Peso normal";
        } else {
            return "Sobrepeso/Obesidade";
        }
    }

    public void atualizarPeso(double novoPeso) {
        if (novoPeso > 0) {
            this.peso = novoPeso;
        }
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }
}
