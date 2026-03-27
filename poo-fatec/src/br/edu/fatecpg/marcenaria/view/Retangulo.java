package br.edu.fatecpg.marcenaria.view;

import java.util.Scanner;

import br.edu.fatecpg.marcenaria.model.RetanguloModel;

public class Retangulo {

   public static void main(String[] args) {
                  Scanner sc = new Scanner(System.in);
                  System.out.print("Digite a largura do retângulo (ex: 5,5): ");
                  double largura = sc.nextDouble();

                  System.out.print("Digite a altura do retângulo (ex: 3,0): ");
                  double altura = sc.nextDouble();

                  RetanguloModel meuRetangulo = new RetanguloModel(largura, altura);

                  System.out.println("\n--- Resultado ---");
                  System.out.printf("Largura  : %.2f%n", meuRetangulo.getLargura());
                  System.out.printf("Altura   : %.2f%n", meuRetangulo.getAltura());
                  System.out.printf("Área     : %.2f%n", meuRetangulo.calcularArea());
                  System.out.printf("Perímetro: %.2f%n", meuRetangulo.calcularPerimetro());
                  sc.close();
            
      }
   
}

