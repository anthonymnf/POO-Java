package listas.lista01.resolução;

import java.util.Scanner;

public class Q4 {
  public static void main(String[] args) {
    double c, f;
    Scanner input = new Scanner(System.in);
    System.out.print("Informe a temperatura em graus centígrados: ");
    c = input.nextDouble();
    f = (c * 9 / 5) + 32;
    System.out.print("A temperatura em graus Fahrenheit é: " + f);
    input.close();
  }
}
