package aula07;

import java.util.Random;

public class Luta {

    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    public void marcarLuta (Lutador desafiante, Lutador desafiado) {
        if (desafiante.getCategoria().equals(desafiado.getCategoria()) && desafiante != desafiado) {
            this.setAprovada(true);
            this.setDesafiante(desafiante);
            this.setDesafiado(desafiado);
        } else {
            this.setAprovada(false);
        }
    }

    public void lutar () {
        if (!isAprovada()) {
            System.out.println("Luta não pode acontecer!");
            return;
        }

        Random aleatorio = new Random();

        int resultado = aleatorio.nextInt(3);

        switch (resultado) {
            case 0:
                System.out.println("Empate!");
                this.desafiante.empatarLuta();
                this.desafiado.empatarLuta();
                break;
            case 1:
                System.out.println("Venceu: " + this.desafiado.getNome());
                this.desafiado.ganharLuta();
                this.desafiante.perderLuta();
                break;
            case 2:
                System.out.println("Venceu: " + this.desafiante.getNome());
                this.desafiado.perderLuta();
                this.desafiante.ganharLuta();
        }
    }

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

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovado) {
        this.aprovada = aprovado;
    }
}
