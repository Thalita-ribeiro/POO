package controle;

public class Controle {

    public static void main(String[] args) {
        ControleRemoto controleRemoto = new ControleRemoto();
        controleRemoto.ligar();

        controleRemoto.maisVolume();
        controleRemoto.setVolume(9);

        controleRemoto.abrirMenu();
        controleRemoto.fecharMenu();
    }
}
