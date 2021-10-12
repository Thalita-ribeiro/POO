package caneta;

public class Caneta2 {
    public static void main(String[] args) {
        Caneta caneta = new Caneta("Bic", 10F);
        caneta.setModelo("Cristal");
        caneta.setCor("Preto");
        caneta.setPonta(20F);
        caneta.isTampada();

        caneta.tampar();
        caneta.status();
    }
}
