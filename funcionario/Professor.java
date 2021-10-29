package funcionario;

public class Professor extends Funcionario {

    public Professor(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }

    @Override
    public double getBonificacao() {
        return super.getSalario() * 1.5;
    }
}
