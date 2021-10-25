package video;

public class Visualizacao {
    private Gafanhoto espectador;
    private Video filme;

    public Visualizacao(Gafanhoto espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotalAssistido(this.espectador.getTotalAssistido() + 1);
        this.filme.setViews(this.filme.getViews() + 1);
    }

    public void avaliar() {
        this.filme.setAvaliacao(5);
    }

    public void avaliar(int nota) {
        this.filme.setAvaliacao(nota);
    }

    public void avaliar(double porcetagem) {
        int total = 0;

        if (porcetagem <= 20) {
            total = 3;
        } else if (porcetagem <= 50) {
            total = 5;
        } else if (porcetagem <= 90) {
            total = 8;
        } else {
            total = 10;
        }
        this.filme.setAvaliacao(total);
    }

    @Override
    public String toString() {
        return "Visualizacao: " + "\n" +
                "Espectador = " + espectador + "\n" +
                "Filme = " + filme;
    }
}
