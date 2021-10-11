package poo;

public class Comida {
    boolean comFome;

    public void seEstiverComFomePedirComida() {
        if (comFome) {
            System.out.println("Pedir comida");
        } else {
            System.out.println("Sem fome");
        }
    }

    public static void main(String[] args) {
        Comida comida = new Comida();
        comida.seEstiverComFomePedirComida();
    }
}