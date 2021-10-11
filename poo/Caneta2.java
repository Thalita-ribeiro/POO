package poo;

public class Caneta2 {
    public static void main(String[] args) {
        Caneta caneta = new Caneta();
        caneta.modelo = "Bic";
        caneta.cor = "Vermelha";
        caneta.carga = 50;
        caneta.tampar();

        caneta.status();
        caneta.escrever();
    }
}