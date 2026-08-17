package br.edu.fatec.restaurante.view;

import br.edu.fatec.restaurante.model.Restaurante;
import br.edu.fatec.pedido.model.Pedido;
import br.edu.fatec.pedido.model.ItemPedido;

public class RestauranteView {

    public static void main(String[] args) {
        Restaurante restaurante = new Restaurante();

        Pedido pedido1 = new Pedido(1);
        pedido1.adicionarItem(new ItemPedido("Feijoada", 2, 35.0));
        pedido1.reservarMesa(5);

        Pedido pedido2 = new Pedido(2);
        pedido2.adicionarItem(new ItemPedido("Pizza", 1, 45.0));
        pedido2.reservarMesa(3);

        restaurante.adicionarPedido(pedido1);
        restaurante.adicionarPedido(pedido2);

        System.out.println("Todos os pedidos:");
        restaurante.exibirPedidos();

        System.out.println("\nBuscando pedido numero 2:");
        System.out.println(restaurante.buscarPedido(2));
    }
}
