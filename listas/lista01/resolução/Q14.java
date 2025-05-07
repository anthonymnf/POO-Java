package listas.lista01.resolução;

import java.util.Scanner;

public class Q14 {
  public static void main(String[] args) {
    int n, primeiro = 0, segundo = 1, proximo;
    Scanner input = new Scanner(System.in);
    System.out.print("Informe um valor de n>0: ");
    n = input.nextInt();
    System.out.println("Série de Fibonacci até o " + n + "º termo:");
    System.out.print(primeiro + " ");
    System.out.print(segundo + " ");
    for (int i = 2; i < n; i++) {
      proximo = primeiro + segundo;
      System.out.print(proximo + " ");
      primeiro = segundo;
      segundo = proximo;
    }
    input.close();
  }
}
