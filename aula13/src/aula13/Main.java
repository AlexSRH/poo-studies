package aula13;

public class Main {

    public static void main(String[] args) {
	    Lobo lobo = new Lobo();
	    Cachorro cachorro = new Cachorro();

	    lobo.emitirSom();
	    cachorro.emitirSom();

	    cachorro.reagir(true);
	    cachorro.reagir("Toma comida");
	    cachorro.reagir(12, 32);
    }
}
