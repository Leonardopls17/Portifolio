public class ContaBancaria {

    private String numeroConta;
    private String titular;
    private double saldo;
    private boolean ativa;

    public ContaBancaria(String numeroConta, String titular) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = 0.0;
        this.ativa = true;
    }

    public void depositar(double valor) {
        if (ativa && valor > 0) {
            saldo += valor;
        }
    }

    public boolean sacar(double valor) {
        if (ativa && valor > 0 && valor <= saldo) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    public void desativarConta() {
        ativa = false;
    }

    public double consultarSaldo() {
        return saldo;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public boolean isAtiva() {
        return ativa;
    }
}