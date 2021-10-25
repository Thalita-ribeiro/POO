package video;

public class ProjetoYoutube {
    public static void main(String[] args) {

        Video video[] = new Video[2];
        Gafanhoto gafanhotos[] = new Gafanhoto[2];

        video[0] = new Video("Curso de POO");
        video[0].setReproduzindo(true);
        video[0].like();
        video[0].like();
        video[0].like();
        video[0].setAvaliacao(9);
        video[0].setViews(1000);
        System.out.println(video[0].toString());

        video[1] = new Video("Curso de Java");
        video[1].setReproduzindo(false);

        gafanhotos[0] = new Gafanhoto("Thalita", 21, "Feminino", "sribeiro.thalita");
        System.out.println("-----------------------");
        gafanhotos[0].setTotalAssistido(1000);
        System.out.println(gafanhotos[0].toString());

    }
}
