package br.edu.fatecpg.carro.model;

public class Carro {

  private String marca;
  private double consumo;
  private double combustivelAtual;

  public Carro(String marca, double consumo, double combustivelAtual) {
    this.marca = marca;
    this.consumo = consumo;
    this.combustivelAtual = combustivelAtual;
  }

  public double calcularAutonomia() {
    return combustivelAtual * consumo;
  }

  public boolean simularViagem(double km) {
    double litrosNecessarios = km / consumo;
    if (litrosNecessarios > combustivelAtual) {
      return false;
    }
    combustivelAtual -= litrosNecessarios;
    return true;
  }

  public void abastecer(double litros) {
    combustivelAtual += litros;
  }

  public String getMarca() {
    return marca;
  }

  public double getCombustivelAtual() {
    return combustivelAtual;
  }
}
