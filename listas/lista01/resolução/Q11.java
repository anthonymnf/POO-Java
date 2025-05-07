package listas.lista01.resolução;

import java.util.Scanner;

public class Q11 {
  public static void main(String[] args) {
    double x1, y1, x2, y2;
    Scanner input = new Scanner(System.in);
    System.out.print("Informe o valor de x1: ");
    x1 = input.nextDouble();
    System.out.print("Informe o valor de y1: ");
    y1 = input.nextDouble();
    System.out.print("Informe o valor de x2: ");
    x2 = input.nextDouble();
    System.out.print("Informe o valor de y2: ");
    y2 = input.nextDouble();
    System.out.println("O segundo ponto está:");
    if (y1 < y2) {
      System.out.println("- Acima");
    } else if (y2 < y1) {
      System.out.println("- Abaixo");
    } else {
      System.out.println("- Na mesma altura");
    }

    if (x2 < x1) {
      System.out.println("- Esquerda");
    } else if (x1 < x2) {
      System.out.println("- Direita");
    } else {
      System.out.println("- Na mesma largura");
    }

    input.close();
  }
}
