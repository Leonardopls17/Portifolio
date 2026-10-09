public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private double velocidadeAtual;
    private boolean motorLigado;

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidadeAtual = 0.0;
        this.motorLigado = false;
    }

    public void ligarMotor() {
        motorLigado = true;
    }

    public void desligarMotor() {
        if (velocidadeAtual == 0) {
            motorLigado = false;
        }
    }

    public void acelerar(double incremento) {
        if (motorLigado && incremento > 0) {
            velocidadeAtual += incremento;
        }
    }

    public void frear(double decremento) {
        if (decremento > 0) {
            velocidadeAtual = Math.max(0.0, velocidadeAtual - decremento);
        }
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public double getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public boolean isMotorLigado() {
        return motorLigado;
    }
}
