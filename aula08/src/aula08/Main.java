package aula08;

public class Main {

    public static void main(String[] args) {
	    Pessoa escritor = new Pessoa("Robert C. Martin", 68, 'M');
        Pessoa leitor = new Pessoa("Alexsandro G. Bezerra", 16, 'M');

        Livro livro = new Livro("Clean Code", 464, escritor, leitor);

        livro.abrir();
        livro.folhear();
        livro.fechar();
        livro.avancarPagina();

        livro.detalhes();
    }
}
