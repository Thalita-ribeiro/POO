package funcionario;

public class Professor extends Funcionario {
    private boolean corrigiuAsProvas;

    public Professor(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }

    @Override
    public double getBonificacao() {
        return super.getSalario() * 1.5;
    }

    public void corrigirProva() {
        System.out.println("Corrigiu as provas dos alunos? " + true);
    }
}
