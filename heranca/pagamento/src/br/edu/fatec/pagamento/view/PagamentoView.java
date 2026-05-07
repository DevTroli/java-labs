package br.edu.fatec.pagamento.view;

import br.edu.fatec.pagamento.model.Pagamento;
import br.edu.fatec.pagamento.model.PagamentoCartao;
import br.edu.fatec.pagamento.model.PagamentoDinheiro;

public class PagamentoView {

    public void executar() {
        PagamentoCartao cartao = new PagamentoCartao(100.00);
        System.out.println(cartao.emitirRecibo());

        System.out.println();

        PagamentoDinheiro dinheiro = new PagamentoDinheiro(100.00);
        System.out.println(dinheiro.emitirRecibo());
    }
}
