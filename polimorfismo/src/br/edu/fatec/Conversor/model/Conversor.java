package br.edu.fatec.Conversor.model;

public class Conversor {

    public double converter(double celsius) {
        return (celsius * 9.0 / 5.0) + 32;
    }

    public double converter(int quilometros) {
        return quilometros * 0.621371;
    }

    public String converter(String texto) {
        return texto.toUpperCase();
    }
}