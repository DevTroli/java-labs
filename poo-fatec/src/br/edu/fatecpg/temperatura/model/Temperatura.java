package br.edu.fatecpg.temperatura.model;

public class Temperatura {

    private double celsius;

    public Temperatura(double celsius) {
        this.celsius = celsius;
    }

    public double toFahrenheit() {
        return celsius * 9.0 / 5.0 + 32;
    }

    public double toKelvin() {
        return celsius + 273.15;
    }

    public double getCelsius() { return celsius; }
}
