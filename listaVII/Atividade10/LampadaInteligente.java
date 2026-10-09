public class LampadaInteligente {
    private String marca;
    private boolean ligada;
    private int intensidadeBrilho;
    private String corAtual;

    public LampadaInteligente(String marca) {
        this.marca = marca;
        this.ligada = false;
        this.intensidadeBrilho = 100;
        this.corAtual = "Branca";
    }

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    public void ajustarBrilho(int novoBrilho) {
        if (novoBrilho >= 0 && novoBrilho <= 100) {
            intensidadeBrilho = novoBrilho;
        }
    }

    public void mudarCor(String novaCor) {
        if (ligada && novaCor != null && !novaCor.trim().isEmpty()) {
            corAtual = novaCor;
        }
    }

    public String getMarca() {
        return marca;
    }

    public boolean isLigada() {
        return ligada;
    }

    public int getIntensidadeBrilho() {
        return intensidadeBrilho;
    }

    public String getCorAtual() {
        return corAtual;
    }
}
