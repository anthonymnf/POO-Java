package listas.lista01.resolução.Q102;

import java.util.Scanner;

public class SomaNumeros {

  public static int obterIntValido(Scanner scanner) {
    while (true) {
      try {
        System.out.print("Digite um número inteiro: ");
        return Integer.parseInt(scanner.nextLine());
      } catch (NumberFormatException e) {
        System.out.println("❌ Erro: entrada inválida. Tente novamente.");
      }
    }
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int num1 = obterIntValido(scanner);
    int num2 = obterIntValido(scanner);

    int soma = num1 + num2;

    System.out.println("✅ A soma é: " + soma);

    scanner.close();

  }
}
