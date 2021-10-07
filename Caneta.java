public class Caneta {
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
        Caneta caneta = new Caneta();
        caneta.rabiscar();

        Caneta caneta2 = new Caneta();
        caneta2.destampar();
        caneta2.tampar();
        caneta2.rabiscar();
    }
}