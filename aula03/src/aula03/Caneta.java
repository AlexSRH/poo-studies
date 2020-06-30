package aula03;

public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;

    public void escrever() {
        if (this.tampada) {
            System.out.println("Erro! A caneta está tampada");
        } else {
            this.rabiscar();
        }
    }

    private void rabiscar() {
        System.out.println("Rabiscando...");
    }

    public void tampar() {
        this.tampada = true;
    }

    public void destampar() {
        this.tampada = false;
    }
}
