package br.edu.fatecpg.ContaBancaria.view;

import br.edu.fatecpg.ContaBancaria.model.ContaBancaria;
import java.util.Scanner;

public class ContaBancariaView {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String continuar;

    System.out.println("\n===FATECPAY===\n");

    ContaBancaria usuario = new ContaBancaria();

    System.out.print("Qual o nome do titular da conta? ");
    usuario.setTitular(sc.nextLine());

    do {

      System.out.println("\nOla " + usuario.getTitular() + " Como podemos lhe ajudar?");
      System.out.print("\nDepositar ou Sacar:  ");
      String resposta = (sc.nextLine());
      if (resposta.equals("Depositar")) {
        System.out.print("Quanto gostaria depositar: ");
        usuario.depositar(sc.nextDouble());
        sc.nextLine();
        System.out.println("Deposito realizado com sucesso!");
        System.out.println("Seu saldo atual ficou: R$" + usuario.getSaldo() + " Reais");
      } else if (resposta.equals("Sacar")) {
        System.out.print("Quanto gostaria de sacar: ");
        boolean sacouOk = usuario.sacar(sc.nextDouble());
        sc.nextLine();
        if (sacouOk) {
          System.out.println("Saque realizado com sucesso!");
          System.out.println("Seu saldo: R$" + usuario.getSaldo());
        } else System.out.println("Saldo insuficiente!");
      } else System.out.println("Error! Tente Novamente");

      System.out.print("Podemos te ajudar como mais alguma coisa (s/n)? ");
      continuar = sc.nextLine();

    } while (continuar.equals("s"));
    sc.close();
  }
}
