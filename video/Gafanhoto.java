package video;

public class Gafanhoto extends Pessoa {
    private String login;
    private double totalAssistido;

    public Gafanhoto(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
    }

    public double getTotalAssistido() {
        return totalAssistido;
    }

    public void setTotalAssistido(double totalAssistido) {
        this.totalAssistido = totalAssistido;
    }

    public void viuMaisUm() {
        this.totalAssistido++;
    }

    @Override
    public String toString() {
        return "Gafanhoto: " + "\n" +
                " Nome = " + nome + "\n" +
                " Idade = " + idade + "\n" +
                " Sexo = " + sexo + "\n" +
                " Login = " + login + "\n" +
                " Total Assistido = " + totalAssistido + "\n" +
                " Experiencia = " + experiencia + "\n" +
                "-------------------------";
    }
}
