package br.edu.fatec.pagamento.model;

public class PagamentoCartao implements Pagamento {

	private double valor;
	private static final double TAXA = 0.05;

	public PagamentoCartao(double valor) {
		this.valor = valor;
	}

	@Override
	public double calcularPagamento() {
		return valor + (valor * TAXA);
	}

	@Override
	public String emitirRecibo() {
		return "=== Recibo - Cartao ===\n"
			+ "Valor original : R$ " + valor + "\n"
			+ "Taxa (5%): R$ " + (valor * TAXA) + "\n"
			+ "Total: R$ " + calcularPagamento();
	}
}
