package br.edu.fatec.carro.model;
public class Carro{
  public String marca;
  public String modelo;
  public int ano;

  public Carro (String marca, String modelo, int ano){
    this.marca = marca;
    this.modelo = modelo;
    this.ano= ano;
  }

  public void ExibirInfos(){
    System.out.println("Modelo: " + this.modelo);
    System.out.println("Marca: " + this.marca);
    System.out.println("Ano: " + this.ano);
  }

}
