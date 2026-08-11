package br.edu.fatec.restaurante.view;

import br.edu.fatec.restaurante.model.Restaurante;
import java.util.Scanner;

/**
 * View: RestauranteView
 *
 * Boas práticas:
 *  - Contém o main()
 *  - Lê entrada com Scanner
 *  - Imprime com System.out
 *  - NUNCA tem lógica de negócio — delega tudo ao model
 */
public class RestauranteView {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ── Leitura ───────────────────────────────────────────────────────
        // TODO: leia os dados do usuário
        // System.out.print("Nome: ");
        // String nome = sc.nextLine();

        // ── Instancia o model ─────────────────────────────────────────────
        // Restaurante obj = new Restaurante(/* parâmetros */);

        // ── Exibe resultados ──────────────────────────────────────────────
        // System.out.printf("Resultado: %.2f%n", obj.calcular());

        sc.close();
    }
}
