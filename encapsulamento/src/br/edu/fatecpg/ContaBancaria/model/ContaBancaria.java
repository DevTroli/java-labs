package br.edu.fatecpg.ContaBancaria.model;

public class ContaBancaria {

  private String titular;
  private double saldo = 0;

  public String getTitular() {
    return titular;
  }

  public void setTitular(String titular) {
    this.titular = titular;
  }

  public double getSaldo() {
    return saldo;
  }

  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

  public void depositar(double valor) {
    if (valor > 0) {
      this.saldo += valor;
    }
  }

  public boolean sacar(double valor) {
    if (this.saldo >= valor) this.saldo -= valor;
    else return false;

    return true;
  }
}
