package aula07;

public class Lutador {

    private String nome, nacionalidade, categoria;
    private float altura, peso;
    private int idade, vitorias, derrotas, empates;

    public void apresentar () {
        System.out.println("Lutador{" +
                "nome='" + nome + '\'' +
                ", nacionalidade='" + nacionalidade + '\'' +
                ", categoria='" + categoria + '\'' +
                ", altura=" + altura +
                ", peso=" + peso +
                ", idade=" + idade +
                ", vitorias=" + vitorias +
                ", derrotas=" + derrotas +
                ", empates=" + empates +
                '}');
    }

    public void ganharLuta () {
        this.setVitorias(this.getVitorias() + 1);
    }

    public void perderLuta () {
        this.setDerrotas(this.getDerrotas() + 1);
    }

    public void empatarLuta () {
        this.setEmpates(this.getEmpates() + 1);
    }

    public Lutador(String nome,
                   String nacionalidade,
                   float altura,
                   float peso,
                   int idade,
                   int vitorias,
                   int derrotas,
                   int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.altura = altura;
        this.idade = idade;
        this.setPeso(peso);
        this.vitorias = 0;
        this.derrotas = 0;
        this.empates = 0;
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        float peso = this.getPeso();

        if (peso < 52.2f) {
            this.categoria = "Inválido";
        } else if (peso <= 70.3f) {
            this.categoria = "Leve";
        } else if (peso <= 83.9f) {
            this.categoria = "Médio";
        } else if (peso <= 103.2f) {
            this.categoria = "Pesado";
        } else {
            this.categoria = "Inválido";
        }
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        setCategoria();
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
}
