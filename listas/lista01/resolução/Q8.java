package listas.lista01.resolução;

import java.util.Scanner;

public class Q8 {
  public static void main(String[] args) {
    int cod;
    double valorOriginal, valorFinal;
    Scanner input = new Scanner(System.in);
    System.out.print("Informe o código do setor: ");
    cod = input.nextInt();
    if (cod != 111 && cod != 222) {
      System.out.println("Setor inválido");
      input.close();
      return;
    }
    System.out.print("Informe o valor do produto: ");
    valorOriginal = input.nextDouble();
    valorFinal = valorOriginal;
    if (cod == 111) {
      System.out.println("Setor de cama, mesa e banho");
      if (valorOriginal > 100) {
        valorFinal = valorOriginal - (valorOriginal * 0.4);
      } else if (valorOriginal < 50) {
        valorFinal = valorOriginal - (valorOriginal * 0.1);
      } else {
        valorFinal = valorOriginal - (valorOriginal * 0.2);
      }
    } else if (cod == 222) {
      System.out.println("Setor de eletros");
      if (valorOriginal > 500) {
        valorFinal = valorOriginal - (valorOriginal * 0.10);
      }
    }
    System.out.println("O valor final do produto é R$" + valorFinal);
    input.close();
  }
}
