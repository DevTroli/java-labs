package br.edu.fatecpg.esfera.view;

import br.edu.fatecpg.esfera.model.Esfera;
import java.util.Scanner;

public class EsferaView {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Raio da esfera (cm): ");
    double raio = sc.nextDouble();

    Esfera esfera = new Esfera(raio);

    System.out.printf("Volume          : %.4f cm³%n", esfera.calcularVolume());
    System.out.printf("Área superficial: %.4f cm²%n", esfera.calcularAreaSuperficie());

    sc.close();
  }
}
