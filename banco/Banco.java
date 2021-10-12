package banco;

public class Banco {
    int numeroDaConta;
    protected String tipo;
    private String nome;
    private float saldo;
    private boolean status;

    public void estadoAtual() {
        System.out.println("Banco ");
        System.out.println("Conta " + this.getNumeroDaConta());
        System.out.println("Tipo " + this.getTipo());
        System.out.println("Dono " + this.getNome());
        System.out.println("Saldo " + this.getSaldo());
        System.out.println("Status " + this.isStatus());
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void abrirConta(String tipo) {
        this.setTipo(tipo);
        this.setStatus(true);

        if (tipo.equals("CC")) {
            this.setSaldo(50);
        } else if (tipo.equals("CP")) {
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso! ");
    }

    public void fecharConta(String tipo) {
        this.setTipo(tipo);
        this.setStatus(false);

        if (this.getSaldo() > 0) {
            System.out.println("Conta com dinheiro ");
        } else if (this.getSaldo() < 0) {
            System.out.println("Conta com débito ");
        } else {
            setStatus(false);
        }
        System.out.println("Conta fechada com sucesso! ");
    }

    public void depositar(float valor) {
        if (this.isStatus()) {
            this.setSaldo(this.getSaldo() + valor);
            System.out.println("Depósito realizadona na conta de " + nome);
        } else {
            System.out.println("Impossivel depositar em uma conta fechada ");
        }
    }

    public void sacar(float valor) {
        if (this.isStatus()) {
            if (this.getSaldo() >= valor) {
                this.setSaldo(this.getSaldo() - valor);
                System.out.println("Saque realizado na conta de " + this.getNome());
            } else {
                System.out.println("Saldo insuficiente para saque");
            }
        } else {
            System.out.println("Impossivel sacar de uma conta fechada!");
        }
    }

    public void pagarMensalidade() {
        int valor = 0;
        if (this.getTipo().equals("CC")) {
            valor = 12;
        } else if (this.getTipo().equals("CP")) {
            valor = 20;
        }
        if (this.isStatus()) {
            this.setSaldo(this.getSaldo() - valor);
            System.out.println("Mensalidade paga com sucesso por " + this.getNome());
        } else {
            System.out.println("Impossivel pagar uma conta fechada!");
        }
    }
}