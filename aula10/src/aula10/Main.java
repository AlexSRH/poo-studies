package aula10;

public class Main {

    public static void main(String[] args) {
	    Pessoa pessoa = new Pessoa();
	    Aluno aluno = new Aluno();
	    Professor professor = new Professor();
	    Funcionario funcionario = new Funcionario();

	    pessoa.setNome("Pedro");
	    aluno.setNome("Maria");
	    professor.setNome("Claudio");
	    funcionario.setNome("Fabiana");

		System.out.println(aluno.toString());
    }
}
