package listas.lista01.resolução;

import java.util.Scanner;

public class Q15 {
  public static void main(String[] args) {
    int cont = 0, n;
    Scanner input = new Scanner(System.in);
    System.out.print("Informe o valor de n: ");
    n = input.nextInt();
    System.out.printf("Os 4 primeiros números perfeitos de %d são: \n", n);
    for (int i = 1; i < n; i++) {
      if (cont == 4) {
        break;
      }
      if (n % i == 0) {
        System.out.printf("%02d \n", i);
        cont++;
      }
    }
    if (cont < 4) {
      System.out.println("Este número tem menos de 4 números perfeitos");
    }
    input.close();
  }
}
