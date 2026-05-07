package br.edu.fatec.atvd3.view;

import br.edu.fatec.atvd3.model.Atvd3;
import java.util.Scanner;

/**
 * View: Atvd3View
 *
 * Boas práticas:
 *  - Contém o main()
 *  - Lê entrada com Scanner
 *  - Imprime com System.out
 *  - NUNCA tem lógica de negócio — delega tudo ao model
 */
public class Atvd3View {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ── Leitura ───────────────────────────────────────────────────────
        // TODO: leia os dados do usuário
        // System.out.print("Nome: ");
        // String nome = sc.nextLine();

        // ── Instancia o model ─────────────────────────────────────────────
        // Atvd3 obj = new Atvd3(/* parâmetros */);

        // ── Exibe resultados ──────────────────────────────────────────────
        // System.out.printf("Resultado: %.2f%n", obj.calcular());

        sc.close();
    }
}
