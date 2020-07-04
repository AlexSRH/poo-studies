package aula07;

public class Main {

    public static void main(String[] args) {
        Lutador[] lutadores = new Lutador[6];

        lutadores[0] = new Lutador("Pretty Boy", "França", 1.75f, 68.9f, 31, 11, 2, 1);
        lutadores[1] = new Lutador("Putscript", "Brasil", 1.68f, 57.8f, 29, 14, 2, 3);
        lutadores[2] = new Lutador("Snapshadow", "EUA", 1.65f, 80.9f, 35, 12, 2, 1);
        lutadores[3] = new Lutador("Dead Code", "Austrália", 1.93f, 81.6f, 28, 13, 0, 2);
        lutadores[4] = new Lutador("Ufocobol", "Brasil", 1.70f, 119.3f, 37, 15, 4, 3);
        lutadores[5] = new Lutador("Nerdaard", "EUA", 1.81f,105.7f, 30, 12, 2, 4);

        Luta luta1 = new Luta();
        luta1.marcarLuta(lutadores[5], lutadores[4]);
        luta1.lutar();
    }
}