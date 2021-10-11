public class Caneta2 {
    boolean tampada;

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
        Caneta2 caneta = new Caneta2();
        caneta.rabiscar();

        Caneta2 caneta2 = new Caneta2();
        caneta2.destampar();
        caneta2.tampar();
        caneta2.rabiscar();
    }
}