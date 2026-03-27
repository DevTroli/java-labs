package br.edu.fatecpg.estoque.model;

public class ProdutoModel {
    private String nome;
    private double preco;
    private int quantidade;

    public ProdutoModel(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public double calcularTotal() {
        return this.preco * this.quantidade;
    }

    public void entrada(int qtd) { this.quantidade += qtd; }
    public void saida(int qtd) { this.quantidade -= qtd; }

    public String getNome() { return nome; }
    public int getQuantidade() { return quantidade; }
}