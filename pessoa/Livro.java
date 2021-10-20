package pessoa;

public class Livro implements Publicacao {
    private String titulo;
    private String autor;
    private boolean aberto = false;
    private int totalDePagina;
    private int paginaAtual;
    private Pessoa leitor;

    public Livro(String titulo, String autor, int totalDePagina, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totalDePagina = totalDePagina;
        this.leitor = leitor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public int getTotalDePagina() {
        return totalDePagina;
    }

    public void setTotalDePagina(int totalDePagina) {
        this.totalDePagina = totalDePagina;
    }

    public int getPaginaAtual() {
        return paginaAtual;
    }

    public void setPaginaAtual(int paginaAtual) {
        this.paginaAtual = paginaAtual;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    public String dethalhes() {
        return
                "Livro: " + "\n" +
                        "titulo = " + titulo + "\n" +
                        " autor = " + autor + "\n" +
                        " aberto = " + aberto + "\n" +
                        " totalDePagina = " + totalDePagina + "\n" +
                        " paginaAtual = " + paginaAtual + "\n" +
                        " leitor = " + leitor.getNome() + "\n" +
                        " Idade = " + leitor.getIdade() + "\n" +
                        " Sexo = " + leitor.getSexo();
    }

    @Override
    public void abrir() {
        this.setAberto(true);
    }

    @Override
    public void fechar() {
        this.aberto = false;
    }

    @Override
    public void folhear(int pagina) {
        this.paginaAtual = pagina + paginaAtual;

        if (pagina < getTotalDePagina()) {
            this.paginaAtual = 0;
        } else {
            this.paginaAtual = pagina;
        }
    }

    @Override
    public void avancarPagina() {
        setPaginaAtual(getPaginaAtual() + 1);
    }

    @Override
    public void voltarPagina() {
        setPaginaAtual(getPaginaAtual() - 1);
    }
}
