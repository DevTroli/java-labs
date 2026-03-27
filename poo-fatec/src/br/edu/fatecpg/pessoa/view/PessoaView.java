package br.edu.fatecpg.pessoa.view;

import br.edu.fatecpg.pessoa.model.Pessoa;
import java.util.Scanner;

public class PessoaView {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Nome: ");
    String nome = sc.nextLine();
    System.out.print("Peso (kg): ");
    double peso = sc.nextDouble();
    System.out.print("Altura (m): ");
    double altura = sc.nextDouble();

    Pessoa pessoa = new Pessoa(nome, peso, altura);

    System.out.printf("Nome         : %s%n", pessoa.getNome());
    System.out.printf("IMC          : %.2f%n", pessoa.calcularImc());
    System.out.printf("Classificação: %s%n", pessoa.classificarImc());

    sc.close();
  }
}
