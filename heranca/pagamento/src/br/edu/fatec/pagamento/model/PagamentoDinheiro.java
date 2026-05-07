package br.edu.fatec.pagamento.model;

public class PagamentoDinheiro implements Pagamento {

	private double valor;
	private static final double DESCONTO = 0.10;

	public PagamentoDinheiro(double valor) {
		this.valor = valor;
	}

	@Override
	public double calcularPagamento() {
		return valor - (valor * DESCONTO);
	}

	@Override
	public String emitirRecibo() {
		return "=== Recibo - Dinheiro ===\n"
			+ "Valor original: R$ " + valor + "\n"
			+ "Desconto (10%): R$ " + (valor * DESCONTO) + "\n"
			+ "Total: R$ " + calcularPagamento();
	}
}
