package lutador;

public class UltraEmojiCombat {
    public static void main(String[] args) {
        Lutador lutador[] = new Lutador[6];

        lutador[0] = new Lutador("Juliano", "Brasil", 29, 1.80, 90, 11, 2, 1);
        lutador[0].ganharVitoria();
        lutador[0].status();

        lutador[1] = new Lutador("Adam", "EUA", 36, 1.75, 80, 20, 4, 4);
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
    }
}
