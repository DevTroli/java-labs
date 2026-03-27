package br.edu.fatecpg.vendedor.model;

public class Vendedor {

  private static final double SALARIO_BASE = 1800.00;

  private String nome;
  private double totalVendas;
  private double percentualComissao;

  public Vendedor(String nome, double totalVendas, double percentualComissao) {
    this.nome = nome;
    this.totalVendas = totalVendas;
    this.percentualComissao = percentualComissao;
  }

  public double calcularComissao() {
    return totalVendas * (percentualComissao / 100.0);
  }

  public double calcularSalarioFinal() {
    return SALARIO_BASE + calcularComissao();
  }

  public String getNome() {
    return nome;
  }

  public double getTotalVendas() {
    return totalVendas;
  }
}
