package lutador;

import java.util.Objects;
import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovado;

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }

    public void marcarLuta(Lutador desafiado, Lutador desafiante) {
        if (Objects.equals(desafiado.getCategoria(), desafiante.getCategoria()) && desafiante != desafiado) {
            this.aprovado = true;
            this.desafiado = desafiado;
            this.desafiante = desafiante;
        } else {
            this.aprovado = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }

    public void lutar() {
        if (this.aprovado) {
            System.out.println("------------------------------");
            this.desafiado.apresentar();
            System.out.println("------------------------------");
            this.desafiante.apresentar();

            Random random = new Random();

            int vencedor = random.nextInt(3);

            System.out.println("=======RESULTADO DA LUTA=======");
            switch (vencedor) {
                case 0:
                    System.out.println("Empatou!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1:
                    System.out.println("Vitória do " + desafiado.getNome());
                    this.desafiado.ganharVitoria();
                    this.desafiante.perderLuta();
                    break;
                case 2:
                    System.out.println("Vitória do " + desafiante.getNome());
                    this.desafiante.ganharVitoria();
                    this.desafiado.perderLuta();
                    break;
            }
            System.out.println("===============================");

        } else {
            System.out.println("------------------------------");
            System.out.println("A luta não pode acontecer!");
        }
    }
}
