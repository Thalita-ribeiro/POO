package lutador;

public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private double altura;
    private double peso;
    private String categoria;
    private int vitoria;
    private int derrotas;
    private int empates;

    public Lutador(String nome, String nacionalidade, int idade, double altura,
                   double peso, int vitoria, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitoria = vitoria;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    public String getNome() {
        return nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria() {
        this.categoria = categoria;
        if (this.peso < 52.2) {
            categoria = "Inválido";
        } else if (this.peso <= 70.3) {
            categoria = "Leve";
        } else if (this.peso <= 83.9) {
            categoria = "Médio";
        } else if (this.peso <= 120.2) {
            categoria = "Pesado";
        } else {
            categoria = "Inválido";
        }
    }

    public int getVitoria() {
        return vitoria;
    }

    public void setVitoria(int vitoriaa) {
        this.vitoria = vitoriaa;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public void apresentar() {
        System.out.println("CHEGOU A HORA! Apresentamos o(a) lutador(a): " + this.getNome());
        System.out.println("Nacionalidade: " + this.getNacionalidade());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Altura: : " + this.getAltura() + " m");
        System.out.println("Peso: " + this.getPeso() + " Kg");
        System.out.println("Categoria: " + this.getCategoria());
        System.out.println("Vitoria: " + this.getVitoria());
        System.out.println("Derotas: " + this.getDerrotas());
        System.out.println("Empates: " + this.getEmpates());
        System.out.println("------------------------------");
    }

    public void status() {
        System.out.println("------------------------------");
        System.out.println(getNome());
        System.out.println("É um peso: " + getCategoria());
        System.out.println("Ganhou " + getVitoria() + " vezes");
        System.out.println("Perdeu " + getDerrotas() + " vezes");
        System.out.println("Empatou " + getEmpates() + " vez");
    }

    public void ganharVitoria() {
        this.setVitoria(this.getVitoria() + 1);
    }

    public void perderLuta() {
        this.setDerrotas(this.getDerrotas() + 1);
    }

    public void empatarLuta() {
        this.setEmpates(this.getEmpates() + 1);
    }
}
