package br.edu.fatec.Pagamento.model;

public class Pagamento {

    protected double valor;

    public Pagamento(double valor) {
        this.valor = valor;
    }

    public void processarPagamento() {
        System.out.println("Processando pagamento genérico");
    }

    public double getValor() {
        return valor;
    }
}