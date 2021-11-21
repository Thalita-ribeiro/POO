package casa;

public class Porta {
    private String cor;
    private float largura;
    private float altura;
    private double peso;
    private boolean aberto;

    public void isAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public boolean abrir() {
        return true;
    }

    public boolean fechar() {
        return false;
    }
}