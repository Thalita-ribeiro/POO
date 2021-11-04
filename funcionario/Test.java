package funcionario;

public class Test {
    public static void main(String[] args) {
        Professor professor = new Professor("Thalita", "4904557811", 12000);
        professor.getBonificacao();
        professor.corrigirProva();

        System.out.println(professor.getNome() + ", seu salario é de: " + professor.getSalario());
        System.out.println(professor.getNome() + ", sua bonificacao é de: " + professor.getBonificacao());
    }
}
