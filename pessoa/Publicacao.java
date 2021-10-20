package pessoa;

public interface Publicacao {
    public abstract void abrir();

    public abstract void fechar();

    public abstract void folhear(int paginaAtual);

    public abstract void avancarPagina();

    public abstract void voltarPagina();
}
