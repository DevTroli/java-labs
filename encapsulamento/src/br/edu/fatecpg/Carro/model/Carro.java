package br.edu.fatecpg.Carro.model;

public class Carro {
  protected String marca;
  protected String modelo;
  protected String placa;
  protected int ano;
  protected double capacidadeTanque;
  protected double nivelAtual = 0;
  protected double cc;
  protected boolean ac;
  protected boolean status = false;

  public String getMarca() {
    return marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public String getModelo() {
    return modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public String getPlaca() {
    return placa;
  }

  public void setPlaca(String placa) {
    this.placa = placa;
  }

  public int getAno() {
    return ano;
  }

  public void setAno(int ano) {
    this.ano = ano;
  }

  public boolean getAc() {
    return ac;
  }

  public void setAc(boolean ac) {
    this.ac = ac;
  }

  public double getCc() {
    return cc;
  }

  public void setCc(double cc) {
    this.cc = cc;
  }

  public double getCapacidadeTanque() {
    return capacidadeTanque;
  }

  public void setCapacidadeTanque(double capacidadeTanque) {
    this.capacidadeTanque = capacidadeTanque;
  }

  public void ignicao() {
    if (status) {
      System.out.println("O carro já está ligado!");
    } else {
      status = true;
      System.out.println("\nIniciando...");
      System.out.println("\nLigado & engatado");
    }
  }

  public void desligar() {
    if (status) {
      status = false;
      System.out.println("\nDesligando...");
      System.out.println("\nDesligado!");
    } else {
      System.out.println("\nO carro já está desligado!");
    }
  }

  public void buzinar() {
    System.out.println("\nBI BI BI BI");
  }

  public void infos() {
    System.out.println("Marca: " + getMarca());
    System.out.println("Modelo: " + getModelo());
    System.out.println("Ano: " + getAno());
    System.out.println("Placa do carro: " + getPlaca());
  }

  public double CalculoEncherTanque(double precoGasolina) {
    double litrosFaltando = capacidadeTanque - nivelAtual;
    return litrosFaltando * precoGasolina;
  }
}
