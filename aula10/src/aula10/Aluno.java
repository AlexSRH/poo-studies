package aula10;

public class Aluno extends Pessoa {
    private int numeroMatricula;
    private String curso;

    public void cancelarMatricula () {
        System.out.println("Matricula será cancelada!");
    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(int numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }


    @Override
    public String toString() {
        return "Aluno{" +
                "numeroMatricula=" + numeroMatricula +
                ", curso='" + curso + '\'' +
                "} " + super.toString();
    }
}
