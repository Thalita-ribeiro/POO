package faculdade;

public class PojetoPessoa {
    public static void main(String[] args) {
        Pessoa pessoa = new Professor();
        Aluno aluno = new Aluno();
        Bolsista bolsista = new Bolsista();
        Professor professor = new Professor();
        Funcionario funcionario = new Funcionario();

        pessoa.setNome("Thalita");
        pessoa.setIdade(19);

        aluno.setNome("Julia");
        aluno.setIdade(20);
        aluno.setMatricula(1111);
        aluno.setCurso("informatica");
        aluno.setSexo("Feminino");
        aluno.pagarMensalidade();

        bolsista.setMatricula(2222);
        bolsista.setNome("Eliane");
        bolsista.setBolsa(100);
        bolsista.setSexo("Feminino");

        professor.setNome("Fernando");
        professor.setIdade(38);

        funcionario.setNome("José");
        funcionario.setIdade(29);

        aluno.setCurso("POO");
        professor.setSalario(900);
        funcionario.setSetor("Professor");

        System.out.println(aluno.toString());
    }
}
