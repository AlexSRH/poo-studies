package aula02;

public class Pizza {
    String sabor;
    int fatias;

    void comerFatia() {
        if (this.fatias != 0) {
            this.fatias--;
            System.out.println("Uma fatia de pizza comida. Restam " + this.fatias + " fatias.");
        } else {
            System.out.println("A pizza já acabou. :(");
        }
    }
}
