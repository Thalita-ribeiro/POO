package banco;

public class Banco1 {
    public static void main(String[] args) {
        Banco banco = new Banco();
        banco.setNumeroDaConta(1016);
        banco.setTipo("CC");
        banco.setNome("Thalita");
        banco.setStatus(true);

        banco.depositar(100);
        banco.depositar(200);
        banco.depositar(100);

        banco.sacar(100);
        banco.estadoAtual();
    }
}
