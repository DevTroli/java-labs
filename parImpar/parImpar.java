import java.util.Scanner;

public class parImpar {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num[] = new int[10];
    int par = 0, impar = 0, somaPar = 0, somaImpar = 0;

    System.out.println("===Calculadora Impar&Par===\n");

    for (int i = 0; i < 10; i++) {
      System.out.print("Digite o " + (i + 1) + "° numero: ");
      num[i] = sc.nextInt();
    }

    for (int i = 0; i < 10; i++) {
      if (num[i] % 2 == 0) {
                System.out.println("===\n"+num[i] + " é par");
        par++;
        somaPar = somaPar + num[i];
      } else {
        System.out.println("===\n"+num[i] + " e impar");
        impar++;
        somaImpar = somaImpar + num[i];
      }
    }

    System.out.println("\nForam selecionados " + par + " números pares e a soma deles é: " + somaPar);
    System.out.println(
        "Foram selecionados " + impar + " números ímpares e a soma deles é: " + somaImpar);

    sc.close();
  }
  }
