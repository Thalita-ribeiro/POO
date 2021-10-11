package poo;

public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma caneta: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Esta tampada?: " + this.tampada);
    }

    public void rabiscar() {
        if (tampada == true) {
            System.out.println("Voce nao vai conseguir rabiscar");
        } else {
            System.out.println("Rabiscar");
        }
    }

    public void tampar() {
        this.tampada = true;
    }

    public void destampar() {
        this.tampada = false;
    }

    public static void main(String[] args) {
        Caneta caneta = new Caneta();
        caneta.modelo = "Big";
        caneta.cor = "Azul";
        caneta.ponta = 7.0F;
        caneta.carga = 100;
        caneta.tampada = true;
        caneta.status();
        caneta.rabiscar();
    }
}