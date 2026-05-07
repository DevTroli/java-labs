package br.edu.fatec.Pagamento.model;

public class PagamentoBoleto extends Pagamento {

    public PagamentoBoleto(double valor) {
        super(valor);
    }

    @Override
    public void processarPagamento() {
        System.out.println("Processando pagamento via boleto bancário");
    }
}