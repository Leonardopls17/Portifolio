public class Funcionario {
    private String nome;
    private String cargo;
    private double salarioBase;
    private int horasExtras;

    public Funcionario(String nome, String cargo, double salarioBase) {
        this.nome = nome;
        this.cargo = cargo;
        this.salarioBase = salarioBase;
        this.horasExtras = 0;
    }

    public void adicionarHorasExtras(int horas) {
        if (horas > 0) {
            horasExtras += horas;
        }
    }

    public void promover(String novoCargo, double novoSalarioBase) {
        this.cargo = novoCargo;
        this.salarioBase = novoSalarioBase;
    }

    public double calcularSalarioLiquido(double valorHoraExtra) {
        return salarioBase + (horasExtras * valorHoraExtra);
    }

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public int getHorasExtras() {
        return horasExtras;
    }
}
