public class Livro {
    private String titulo;
    private String autor;
    private int totalPaginas;
    private int paginaAtual;
    private boolean emprestado;

    public Livro(String titulo, String autor, int totalPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.totalPaginas = totalPaginas;
        this.paginaAtual = 0;
        this.emprestado = false;
    }

    public void avancarPagina() {
        if (paginaAtual < totalPaginas) {
            paginaAtual++;
        }
    }

    public boolean emprestar() {
        if (!emprestado) {
            emprestado = true;
            return true;
        }
        return false;
    }

    public void devolver() {
        emprestado = false;
    }

    public double calcularProgressoLeitura() {
        if (totalPaginas == 0) {
            return 0;
        }
        return (paginaAtual / (double) totalPaginas) * 100;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getTotalPaginas() {
        return totalPaginas;
    }

    public int getPaginaAtual() {
        return paginaAtual;
    }

    public boolean isEmprestado() {
        return emprestado;
    }
}
