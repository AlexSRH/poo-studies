package aula05;

public class Main {

    public static void main(String[] args) {
	    ContaBancaria contaCreusa = new ContaBancaria(1, "Creusa");
	    ContaBancaria contaJubileu = new ContaBancaria(2, "Jubileu");

	    contaJubileu.abrirConta("CC");
	    contaJubileu.depositar(300);

	    contaCreusa.abrirConta("CP");
	    contaCreusa.depositar(500);

	    contaJubileu.estadoAtual();
	    contaCreusa.estadoAtual();
    }
}
