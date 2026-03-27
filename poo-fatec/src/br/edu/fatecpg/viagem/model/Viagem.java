package br.edu.fatecpg.viagem.model;

public class Viagem {

  private double distanciaKm;
  private double consumoKmL;
  private double precoCombustivel;

  public Viagem(double distanciaKm, double consumoKmL, double precoCombustivel) {
    this.distanciaKm = distanciaKm;
    this.consumoKmL = consumoKmL;
    this.precoCombustivel = precoCombustivel;
  }

  public double calcularLitrosNecessarios() {
    return distanciaKm / consumoKmL;
  }

  public double calcularCustoTotal() {
    return calcularLitrosNecessarios() * precoCombustivel;
  }
}
