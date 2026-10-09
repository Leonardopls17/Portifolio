public class PersonagemJogo {
    private String nome;
    private int nivel;
    private int pontosVida;
    private int pontosAtaque;
    private boolean estaVivo;

    public PersonagemJogo(String nome, int pontosVida, int pontosAtaque) {
        this.nome = nome;
        this.nivel = 1;
        this.pontosVida = pontosVida;
        this.pontosAtaque = pontosAtaque;
        this.estaVivo = true;
    }

    public void receberDano(int dano) {
        if (dano > 0 && estaVivo) {
            pontosVida -= dano;
            if (pontosVida <= 0) {
                pontosVida = 0;
                estaVivo = false;
            }
        }
    }

    public void curar(int pontos) {
        if (estaVivo && pontos > 0) {
            pontosVida += pontos;
        }
    }

    public void atacar(PersonagemJogo alvo) {
        if (estaVivo && alvo != null && alvo.estaVivo) {
            alvo.receberDano(pontosAtaque);
        }
    }

    public void subirDeNivel() {
        nivel++;
        pontosAtaque += (int) (pontosAtaque * 0.10);
    }

    public String getNome() {
        return nome;
    }

    public int getNivel() {
        return nivel;
    }

    public int getPontosVida() {
        return pontosVida;
    }

    public int getPontosAtaque() {
        return pontosAtaque;
    }

    public boolean isEstaVivo() {
        return estaVivo;
    }
}
