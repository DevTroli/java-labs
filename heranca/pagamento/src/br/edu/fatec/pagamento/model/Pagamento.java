package br.edu.fatec.pagamento.model;

public interface Pagamento {
    double calcularPagamento();
    String emitirRecibo();
}
