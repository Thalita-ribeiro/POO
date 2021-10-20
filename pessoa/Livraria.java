package pessoa;

public class Livraria {
    public static void main(String[] args) {
        Pessoa[] pessoas = new Pessoa[2];
        pessoas[0] = new Pessoa("Thalita", 21, "Feminino");
        pessoas[1] = new Pessoa("Carol", 26, "Feminino");

        Livro[] livros = new Livro[3];
        livros[0] = new Livro("Aprendendo Java", "Thalita", 480, pessoas[0]);
        livros[0].setAberto(true);
        livros[0].setPaginaAtual(100);

        livros[1] = new Livro("POO", "Carol", 290, pessoas[1]);
        livros[1].setAberto(false);

        livros[2] = new Livro("Algoritmo", "Thati", 500, pessoas[1]);

        System.out.println(livros[1].dethalhes());

    }
}
