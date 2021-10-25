package video;

public class Video implements AcoesVideo {
    private String titulo;
    private int avaliacao;
    private double views;
    private double curtidas;
    private boolean reproduzindo;

    public Video(String titulo) {
        this.titulo = titulo;
    }

    public void setAvaliacao(int avaliacao) {
        int nova;
        nova = (int) ((this.avaliacao + avaliacao) / this.views);
        this.avaliacao = nova;
    }

    public double getViews() {
        return views;
    }

    public void setViews(double views) {
        this.views = views;
    }

    public void setCurtidas(double curtidas) {
        this.curtidas = curtidas;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    @Override
    public void play() {
        this.reproduzindo = true;
    }

    @Override
    public void pause() {
        this.reproduzindo = false;
    }

    @Override
    public void like() {
        this.curtidas++;
    }

    @Override
    public String toString() {
        return "Video: " + "\n" +
                " Titulo = " + titulo + "\n" +
                " Avaliacao = " + avaliacao + "\n" +
                " Views = " + views + "\n" +
                " Curtidas = " + curtidas + "\n" +
                " Reproduzindo = " + reproduzindo;
    }
}
