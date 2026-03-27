package br.edu.fatecpg.veiculos.model;

public class CarroModel {
    private String marca;
    private double consumo;
    private double combustivel;

    public CarroModel(String marca, double consumo, double combustivel) {
        this.marca = marca;
        this.consumo = consumo;
        this.combustivel = combustivel;
    }

    public void viajar(double km) {
        this.combustivel -= (km / consumo);
    }

    public void abastecer(double litros) { this.combustivel += litros; }

    public double getAutonomia() { return this.combustivel * this.consumo; }
}
