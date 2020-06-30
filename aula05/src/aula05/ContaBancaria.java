package aula05;

public class ContaBancaria {
    public int numeroConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean open;

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    public ContaBancaria(int numeroConta, String dono) {
        this.setNumeroConta(numeroConta);
        this.setDono(dono);
        this.setOpen(false);
    }

    public void abrirConta(String tipo) {
        if (this.isOpen()) {
            System.out.println("Erro ao abri conta! A conta já está aberta!");
            return;
        } else if (!tipo.equals("CC") && !tipo.equals("CP")) {
            System.out.println("Erro ao abrir conta! Tipo de conta inválido");
            return;
        }

        float initialValue;

        if (tipo.equals("CC")) {
            initialValue = 50;
        } else {
            initialValue = 150;
        }

        setSaldo(initialValue);
        setTipo(tipo);
        setOpen(true);
    }

    public void fecharConta() {
        if (this.getSaldo() != 0) {
            System.out.println("Erro ao fechar conta! O saldo não é zero");
            return;
        }

        setOpen(false);
    }

    public void depositar(float valor) {
        if (!this.isOpen()) {
            System.out.println("Erro ao depositar! A conta está fechada");
            return;
        }

        setSaldo(getSaldo() + valor);
    }

    public void sacar(float valor) {
        if (!this.isOpen()) {
            System.out.println("Erro ao sacar! A conta está fechada");
            return;
        }

        if (this.getSaldo() < valor) {
            System.out.println("Erro ao sacar! Saldo insuficiente!");
            return;
        }

        this.setSaldo(getSaldo() - valor);
    }

    public void pagarMensalidade() {
        if (!this.isOpen()) {
            System.out.println("Erro ao pagar mensalidade! A conta está fechada");
            return;
        }

        float mensalidade;

        if (this.getTipo().equals("CC")) {
            mensalidade = 12;
        } else {
            mensalidade = 20;
        }

        if (this.getSaldo() < mensalidade ) {
            System.out.println("Erro ao pagar mensalidade! Saldo insuficiente");
            return;
        }

        this.setSaldo(this.getSaldo() - mensalidade);
    }

    public void estadoAtual() {
        System.out.println("-------------------------------");
        System.out.println("Conta: " + this.getNumeroConta());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Aberta: " + this.isOpen());
        System.out.println("-------------------------------");
    }
}
