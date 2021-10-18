package lutador;

public class UltraEmojiCombat {
    public static void main(String[] args) {
        Lutador lutador[] = new Lutador[6];

        lutador[0] = new Lutador("Juliano", "Brasil", 29, 1.80, 90, 11, 2, 1);
        lutador[0].ganharVitoria();
        lutador[0].status();

        lutador[1] = new Lutador("Adam", "EUA", 36, 1.75, 90, 20, 4, 4);
        lutador[1].perderLuta();
        lutador[1].status();

        lutador[2] = new Lutador("Aaron", "França", 27, 1.80, 100, 7, 1, 1);
        lutador[2].empatarLuta();
        lutador[2].status();

        lutador[3] = new Lutador("Goku", "Japão", 30, 1.76, 56, 15, 3, 3);
        lutador[3].status();

        lutador[4] = new Lutador("Valentin", "Alemanha", 31, 1.81, 70, 17, 2, 2);
        lutador[4].status();

        lutador[5] = new Lutador("Yun", "China", 30, 1.77, 93, 12, 1, 1);
        lutador[5].status();

        Luta luta = new Luta();
        luta.marcarLuta(lutador[0], lutador[1]);
        luta.lutar();

        Lutadora lutadora[] = new Lutadora[6];

        lutadora[0] = new Lutadora("Maria", "Brasil", 27, 1.65, 80, 9, 1, 0);

        lutadora[1] = new Lutadora("Julia", "China", 29, 1.70, 75, 15, 2, 1);

        lutadora[2] = new Lutadora("Eduarda", "Alemanha", 28, 1.67, 70, 11, 2, 2);
        lutadora[2].apresentar();

        lutadora[3] = new Lutadora("Hellen", "EUA", 32, 1.76, 90, 75, 2, 0);
        lutadora[3].apresentar();

        lutadora[4] = new Lutadora("Bianca", "Japāo", 34, 1.69, 67, 11, 2, 2);
        lutadora[4].apresentar();

        lutadora[5] = new Lutadora("Gabriela", "França", 31, 1.80, 89, 19, 4, 1);
        lutadora[5].apresentar();

        Luta luta1 = new Luta();
        luta1.marcarLuta(lutadora[0], lutadora[1]);
        luta1.lutar();
    }
}
