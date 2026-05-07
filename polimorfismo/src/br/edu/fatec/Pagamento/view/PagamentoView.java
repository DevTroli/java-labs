package br.edu.fatec.Pagamento.view;

import java.util.Scanner;
import br.edu.fatec.Pagamento.model.Pagamento;
import br.edu.fatec.Pagamento.model.PagamentoCartao;
import br.edu.fatec.Pagamento.model.PagamentoBoleto;

public class PagamentoView {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Pagamento - Sobrescrita de processarPagamento() ===");

        System.out.print("Valor do pagamento: ");
        double valor = Double.parseDouble(sc.nextLine());

        System.out.print("Forma de pagamento (generico/cartao/boleto): ");
        String forma = sc.nextLine().trim().toLowerCase();

        Pagamento p;
        switch (forma) {
            case "cartao":
                p = new PagamentoCartao(valor);
                break;
            case "boleto":
                p = new PagamentoBoleto(valor);
                break;
            default:
                p = new Pagamento(valor);
        }

        p.processarPagamento();

        sc.close();
    }
}