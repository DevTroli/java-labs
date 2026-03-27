package br.edu.fatecpg.pessoa.model;

public class Pessoa {

  private String nome;
  private double peso;
  private double altura;

  public Pessoa(String nome, double peso, double altura) {
    this.nome = nome;
    this.peso = peso;
    this.altura = altura;
  }

  public double calcularImc() {
    return peso / (altura * altura);
  }

  public String classificarImc() {
    double imc = calcularImc();
    if (imc < 18.5)
      return "Abaixo do peso";
    else if (imc < 25.0)
      return "Peso normal";
    else if (imc < 30.0)
      return "Sobrepeso";
    else if (imc < 35.0)
      return "Obesidade grau I";
    else if (imc < 40.0)
      return "Obesidade grau II";
    else
      return "Obesidade grau III (Mórbida)";
  }

  public String getNome() {
    return nome;
  }

  public double getPeso() {
    return peso;
  }

  public double getAltura() {
    return altura;
  }
}
