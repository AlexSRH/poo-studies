package aula13;

public class Cachorro extends Lobo {
    @Override
    public void emitirSom () {
        System.out.println("Au! Au! Au!");
    }

    public void reagir (String frase) {
        if (frase.equals("Toma comida") || frase.equals("Olá")) {
            System.out.println("Abanar e latir");
        } else {
            System.out.println("Rosnar");
        }
    }

    public void reagir (int hora, int minuto) {
        if (hora < 12) {
            System.out.println("Abanar o rabo");
        } else if (hora >= 18) {
            System.out.println("Ignorar");
        } else {
            System.out.println("Rosnar");
        }
    }

    public void reagir (boolean dono) {
        if (dono) {
            System.out.println("Abanar o rabo");
        } else {
            System.out.println("Rosnar");
        }
    }
}
