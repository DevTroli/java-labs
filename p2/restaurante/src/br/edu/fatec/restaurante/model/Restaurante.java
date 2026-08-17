package br.edu.fatec.restaurante.model;

import br.edu.fatec.pedido.model.Pedido;
import java.util.ArrayList;

public class Restaurante {
  private ArrayList<Pedido> pedidos;

  public Restaurante() {
    this.pedidos = new ArrayList<>();
  }

  public void adicionarPedido(Pedido pedido) {
    pedidos.add(pedido);
  }

  public void removerPedido(Pedido pedido) {
    pedidos.remove(pedido);
  }

  public Pedido buscarPedido(int numero) {
    for (Pedido pedido : pedidos) {
      if (pedido.getNumero() == numero) {
        return pedido;
      }
    }
    return null;
  }

  public void exibirPedidos() {
    if (pedidos.isEmpty()) {
      System.out.println("Nenhum pedido realizado.");
      return;
    }
    for (Pedido pedido : pedidos) {
      System.out.println(pedido);
    }
  }
}
