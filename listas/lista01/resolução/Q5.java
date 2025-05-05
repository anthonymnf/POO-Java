package listas.lista01.resolução;

import java.util.Scanner;

public class Q5 {
  public static void main(String[] args) {
    int num, u, c, d, nf;
    Scanner input = new Scanner(System.in);
    System.out.print("Informe um número: ");
    num = input.nextInt();
    c = num / 100;
    d = (num / 10) - (c * 10);
    u = num - (c * 100) - (d * 10);
    nf = (u * 100) + (c * 10) + (d);
    System.out.print(nf);
    input.close();
  }
}
