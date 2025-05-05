package listas.lista01.resolução;

import java.util.Scanner;

public class Q2 {
  public static void main(String[] args) {
    double n1, n2, n3, soma, media;
    Scanner input = new Scanner(System.in);
    System.out.print("Informe o valor de n1: ");
    n1 = input.nextDouble();
    System.out.print("Informe o valor de n2: ");
    n2 = input.nextDouble();
    System.out.print("Informe o valor de n3: ");
    n3 = input.nextDouble();
    soma = n1 + n2 + n3;
    media = soma / 3;
    System.out.println("Soma = " + soma);
    System.out.println("Média = " + media);
    input.close();
  }
}
