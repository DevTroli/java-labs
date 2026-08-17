package br.edu.fatec.pedido.view;

import br.edu.fatec.pedido.model.ItemPedido;
import br.edu.fatec.pedido.model.Pedido;

public class PedidoView {

  public static void main(String[] args) {
    Pedido pedido = new Pedido(1);

    pedido.adicionarItem(new ItemPedido("Feijoada", 2, 35.0));
    pedido.adicionarItem(new ItemPedido("Suco de laranja", 2, 8.0));
    pedido.reservarMesa(5);

    System.out.println("Itens do pedido:");
    for (ItemPedido item : pedido.getItens()) {
      System.out.println("- " + item);
    }

    System.out.println(pedido);
  }
}
