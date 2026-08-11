package br.edu.fatec.pedido.view;

import br.edu.fatec.pedido.model.Pedido;
import java.util.Scanner;

/**
 * View: PedidoView
 *
 * Boas práticas:
 *  - Contém o main()
 *  - Lê entrada com Scanner
 *  - Imprime com System.out
 *  - NUNCA tem lógica de negócio — delega tudo ao model
 */
public class PedidoView {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ── Leitura ───────────────────────────────────────────────────────
        // TODO: leia os dados do usuário
        // System.out.print("Nome: ");
        // String nome = sc.nextLine();

        // ── Instancia o model ─────────────────────────────────────────────
        // Pedido obj = new Pedido(/* parâmetros */);

        // ── Exibe resultados ──────────────────────────────────────────────
        // System.out.printf("Resultado: %.2f%n", obj.calcular());

        sc.close();
    }
}
