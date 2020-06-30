package aula02;

public class Main {

    public static void main(String[] args) {
        Caneta caneta1 = new Caneta();
        caneta1.cor = "Azul";
        caneta1.ponta = 0.5f;
        caneta1.destampar();

        caneta1.rabiscar();
        caneta1.status();

        Pizza pizza1 = new Pizza();
        pizza1.sabor = "Calabresa";
        pizza1.fatias = 8;

        pizza1.comerFatia();
    }
}
