package br.edu.fatecpg.marcenaria.model;

public class RetanguloModel {
   private double largura;
   private double altura;

   public RetanguloModel(double largura, double altura) {
      this.largura = largura;
      this.altura = altura;
   }

   public double calcularArea() {
      return this.largura * this.altura;
   }

   public double calcularPerimetro() {
      return 2.0 * (this.largura + this.altura);
   }

   public double getLargura() {
      return this.largura;
   }

   public double getAltura() {
      return this.altura;
   }
}