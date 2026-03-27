package br.edu.fatecpg.contaenergia.model;

public class ContaEnergia {

  private double consumoKwh;
  private double valorPorKwh;

  public ContaEnergia(double consumoKwh, double valorPorKwh) {
    this.consumoKwh = consumoKwh;
    this.valorPorKwh = valorPorKwh;
  }

  public double calcularValorTotal() {
    return consumoKwh * valorPorKwh;
  }

  public double aplicarDesconto(double percentualDesconto) {
    return calcularValorTotal() * (1 - percentualDesconto / 100.0);
  }

  public double getConsumoKwh() {
    return consumoKwh;
  }
}
