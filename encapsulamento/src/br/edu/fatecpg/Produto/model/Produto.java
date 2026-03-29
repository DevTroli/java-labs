package br.edu.fatecpg.Produto.model;

public class Produto {

  private String nome;
  private double preco;
  private int qtdEstoque;

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public double getPreco() {
    return preco;
  }

  public boolean setPreco(double preco) {
    if (preco < 0)
      return false;
    else {
      this.preco = preco;
      return true;
    }
  }

  public int getQtdEstoque() {
    return qtdEstoque;
  }

  public void setQtdEstoque(int qtdEstoque) {
    if (qtdEstoque >= 0)
      this.qtdEstoque = qtdEstoque;
  }
}
