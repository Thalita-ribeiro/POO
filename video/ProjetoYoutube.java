package video;

public class ProjetoYoutube {
    public static void main(String[] args) {

        Video video[] = new Video[2];
        Gafanhoto gafanhotos[] = new Gafanhoto[2];
        Visualizacao visualizacao[] = new Visualizacao[2];

        video[0] = new Video("Curso de POO");
        video[0].setReproduzindo(true);
        video[0].setViews(2);
        video[0].setCurtidas(100);

        video[1] = new Video("Curso de Java");
        video[1].setReproduzindo(false);

        gafanhotos[0] = new Gafanhoto("Thalita", 21, "Feminino", "sribeiro.thalita");
        gafanhotos[0].setTotalAssistido(2);
        gafanhotos[0].setExperiencia(10);
        gafanhotos[0].viuMaisUm();

        gafanhotos[1] = new Gafanhoto("Hellen", 26, "Feminino", "hellen.caroline");

        visualizacao[0] = new Visualizacao(gafanhotos[0], video[0]);
        visualizacao[0].avaliar(35.0f);
        System.out.println(visualizacao[0].toString());
    }
}
