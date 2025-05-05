package listas.lista01.resolução;

import java.util.Scanner;

public class Q1 {
  public static void main(String[] args) {
    double lado, area;
    Scanner input = new Scanner(System.in);
    System.out.print("Informe o tamanho do lado: ");
    lado = input.nextDouble();
    area = lado * lado;
    System.out.println("O valor da área é: " + area);
    input.close();
  }
}
