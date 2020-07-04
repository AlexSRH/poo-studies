package aula08;

import java.util.Random;

public class Livro implements Publicacao {

    private String titulo;
    private Pessoa autor, leitor;
    private int paginas, paginaAtual;
    private boolean aberto;

    public void detalhes () {
        System.out.println("====================");
        System.out.println("Detalhes do Livro");
        System.out.println("--------------------");
        System.out.println("Título: " + this.getTitulo());
        System.out.println("Autor: " + this.getAutor().getNome());
        System.out.println("Total de páginas: " + this.getPaginas());
        System.out.println("--------------------");
        System.out.println("Leitor: " + this.getLeitor().getNome());
        System.out.println("Página atual: " + this.getPaginaAtual());
        System.out.println("Aberto: " + this.isAberto());
        System.out.println("====================");
    }

    @Override
    public void abrir() {
        this.setAberto(true);
    }

    @Override
    public void fechar() {
        this.setAberto(false);
    }

    @Override
    public void folhear() {
        if (!isAberto()) {
            System.out.println("Impossível folhear um livro fechado!");
            return;
        }

        Random aleatorio = new Random();

        int paginaAleatoria = aleatorio.nextInt(this.getPaginas());

        this.setPaginaAtual(paginaAleatoria);
    }

    @Override
    public void avancarPagina() {
        if (!isAberto()) {
            System.out.println("Impossível avançar a página de um livro fechado!");
            return;
        }
        this.setPaginaAtual(getPaginaAtual() + 1);
    }

    @Override
    public void voltarPagina() {
        if (!isAberto()) {
            System.out.println("Impossível voltar a página de um livro fechado!");
            return;
        }

        this.setPaginaAtual(getPaginaAtual() - 1);
    }

    public Livro (String titulo, int paginas, Pessoa autor, Pessoa leitor) {
        this.setTitulo(titulo);
        this.setPaginas(paginas);
        this.setAutor(autor);
        this.setLeitor(leitor);

        this.setPaginaAtual(0);
        this.setAberto(false);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Pessoa getAutor() {
        return autor;
    }

    public void setAutor(Pessoa autor) {
        this.autor = autor;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public int getPaginaAtual() {
        return paginaAtual;
    }

    public void setPaginaAtual(int paginaAtual) {
        this.paginaAtual = paginaAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }
}
