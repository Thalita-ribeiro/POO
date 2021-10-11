package poo;

public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    protected boolean tampada;

    public void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma caneta: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Esta tampada?: " + this.tampada);
    }

    public void escrever() {
        if (tampada == true) {
            System.out.println("Não escrever");
        } else {
            System.out.println("Escrever");
        }
    }

    public void rabiscar() {
        if (tampada == true) {
            System.out.println("Voce nao vai conseguir rabiscar");
        } else {
            System.out.println("Rabiscar");
        }
    }

    private void tampar() {
        this.tampada = true;
    }

    private void destampar() {
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