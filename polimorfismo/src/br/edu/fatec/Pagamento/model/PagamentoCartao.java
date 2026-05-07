package br.edu.fatec.Pagamento.model;

public class PagamentoCartao extends Pagamento {

    public PagamentoCartao(double valor) {
        super(valor);
    }

    @Override
    public void processarPagamento() {
        System.out.println("Processando pagamento via cartão de crédito");
    }
}