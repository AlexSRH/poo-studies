package aula11;

public class Bolsista extends Aluno {
    private float bolsa;

    public void renovarBolsa() {
        System.out.println("Renovar bolsa de " + this.getNome());
    }

    @Override
    public void pagarMensalidade() {
        System.out.println("Pagando a mensalidade do bolsista " + this.getNome());
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
}
