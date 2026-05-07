package br.edu.fatec.Conversor.view;

import java.util.Scanner;
import br.edu.fatec.Conversor.model.Conversor;

public class ConversorView {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Conversor c = new Conversor();

        System.out.println("=== Conversor - Sobrecarga de converter() ===");

        System.out.print("Temperatura em Celsius: ");
        double celsius = Double.parseDouble(sc.nextLine());
        System.out.println(celsius + "°C → " + c.converter(celsius) + "°F");

        System.out.print("Distância em quilômetros: ");
        int km = Integer.parseInt(sc.nextLine());
        System.out.println(km + " km → " + c.converter(km) + " milhas");

        System.out.print("Texto para maiúsculas: ");
        String texto = sc.nextLine();
        System.out.println('"' + texto + '"' + " → " + '"' + c.converter(texto) + '"');

        sc.close();
    }
}