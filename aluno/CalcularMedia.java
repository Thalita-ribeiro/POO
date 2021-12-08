package aluno;

public class CalcularMedia {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.setNome("Thalita");

        System.out.println(aluno.calcularMedia(10, 10));
    }
}
