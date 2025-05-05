package listas.lista01.resolução;

import java.util.Scanner;

public class Q7 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite o primeiro número: ");
    int numero1 = scanner.nextInt();

    System.out.print("Digite o segundo número: ");
    int numero2 = scanner.nextInt();

    System.out.print("Digite o terceiro número: ");
    int numero3 = scanner.nextInt();

    int menor = numero1; // consideramos inicialmente que o primeiro número é o menor

    if (numero2 < menor) {
      menor = numero2; // se o segundo número for menor, atualizamos a variável menor
    }

    if (numero3 < menor) {
      menor = numero3; // se o terceiro número for menor, atualizamos a variável menor
    }

    System.out.println("O menor número é: " + menor);
    scanner.close();
  }
}
