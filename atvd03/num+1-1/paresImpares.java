import java.util.Scanner;

public class paresImpares {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] num = new int[10];

    System.out.println("===Impares & Pares===\n");

    for (int i = 0; i < 10; i++) {
      System.out.print("Digite o valor " + i + " :");
      num[i] = sc.nextInt();
    }

    System.out.println("\n===Novos Valores===");
    for (int i = 0; i < 10; i++) {
      if (num[i] % 2 != 0) num[i]--;
      else {
        num[i]++;
      }
      System.out.println("Valor " + (i + 1) + ": " + num[i]);
    }

    sc.close();
  }
}
