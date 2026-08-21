package br.edu.fatec.cep.view;

import br.edu.fatec.cep.model.Cep;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CepView {
  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    List<String> historico = new ArrayList<>();
    boolean rodando = true;

    while (rodando) {
      System.out.println("\n1 - Consultar");
      System.out.println("2 - Ver Consultados");
      System.out.println("3 - Limpar Histórico");
      System.out.println("0 - Sair");
      System.out.print("Opção: ");
      int opcao = Integer.parseInt(sc.nextLine());

      switch (opcao) {
        case 1:
          System.out.print("Digite o CEP: ");
          String cep = sc.nextLine();
          String resultado = Cep.buscar(cep);
          System.out.println(resultado);
          historico.add(resultado);
          break;

        case 2:
          for (String item : historico) {
            System.out.println(item);
          }
          break;

        case 3:
          historico.clear();
          System.out.println("Historico Limpo");
          break;

        case 0:
          rodando = false;
          break;

        default:
          System.out.println("Opçao Invalida");
      }
    }
  }
}
