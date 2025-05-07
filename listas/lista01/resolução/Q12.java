package listas.lista01.resolução;

import java.util.Scanner;

public class Q12 {
  public static void main(String[] args) {
    int dia;
    Scanner input = new Scanner(System.in);
    System.out.print("Informe o dia do mês: ");
    dia = input.nextInt();
    switch (dia) {
      case 1, 8, 15, 22:
        System.out.println("O dia " + dia + " será um domingo.");
        break;
      case 2, 9, 16, 23:
        System.out.println("O dia " + dia + " será uma segunda.");
        break;
      case 3, 10, 17, 24:
        System.out.println("O dia " + dia + " será uma terça.");
        break;
      case 4, 11, 18, 25:
        System.out.println("O dia " + dia + " será uma quarta.");
        break;
      case 5, 12, 19, 26:
        System.out.println("O dia " + dia + " será uma quinta.");
        break;
      case 6, 13, 20, 27:
        System.out.println("O dia " + dia + " será uma sexta.");
        break;
      case 7, 14, 21, 28:
        System.out.println("O dia " + dia + " será um sábado.");
        break;
      default:
        System.out.println("Data informada não aceita");
        break;
    }
    input.close();
  }
}
