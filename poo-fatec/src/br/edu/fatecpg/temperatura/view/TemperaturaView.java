package br.edu.fatecpg.temperatura.view;

import br.edu.fatecpg.temperatura.model.Temperatura;
import java.util.Scanner;

public class TemperaturaView {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Temperatura em Celsius: ");
    double celsius = sc.nextDouble();

    Temperatura temp = new Temperatura(celsius);

    System.out.printf("Celsius   : %.2f °C%n", temp.getCelsius());
    System.out.printf("Fahrenheit: %.2f °F%n", temp.toFahrenheit());
    System.out.printf("Kelvin    : %.2f K%n", temp.toKelvin());

    sc.close();
  }
}
