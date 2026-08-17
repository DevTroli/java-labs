package br.edu.fatec.pedido.model;

import java.util.ArrayList;

public class Pedido {
  private static final double TAXA_ENTREGA = 5.0;

  private int numero;
  private ArrayList<ItemPedido> itens;
  private int mesaReservada;

  public Pedido(int numero) {
    this.numero = numero;
    this.itens = new ArrayList<>();
    this.mesaReservada = 0;
  }

  public int getNumero() {
    return numero;
  }

  public ArrayList<ItemPedido> getItens() {
    return itens;
  }

  public void adicionarItem(ItemPedido item) {
    itens.add(item);
  }

  public void removerItem(ItemPedido item) {
    itens.remove(item);
  }

  public void reservarMesa(int numeroMesa) {
    this.mesaReservada = numeroMesa;
    System.out.println("Mesa " + numeroMesa + " reservada para o pedido " + numero);
  }

  public double calcularTotalPedido() {
    double total = 0;
    for (ItemPedido item : itens) {
      total += item.calcularSubtotal();
    }
    return total + TAXA_ENTREGA;
  }

  @Override
  public String toString() {
    return "Pedido "
        + numero
        + " | Mesa: "
        + mesaReservada
        + " | Total: R$ "
        + calcularTotalPedido();
  }
}
