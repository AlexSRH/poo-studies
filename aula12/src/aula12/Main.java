package aula12;

public class Main {
    public static void main(String[] args) {
        Mamifero mamifero = new Mamifero();
        Reptil reptil = new Reptil();
        Peixe peixe = new Peixe();
        Ave ave = new Ave();

        mamifero.setPeso(35.3f);
        mamifero.setCorDoPelo("rosa");
        mamifero.alimentar();
        mamifero.locomover();
    }
}
