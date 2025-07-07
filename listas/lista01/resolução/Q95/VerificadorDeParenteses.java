package listas.lista01.resolução.Q95;

import java.util.Stack;
import java.util.Scanner;

public class VerificadorDeParenteses {
  public static boolean estaBalanceada(String expressao) {
    Stack<Character> pilha = new Stack<>();

    for (char c : expressao.toCharArray()) {
      if (c == '(') {
        pilha.push(c);
      } else if (c == ')') {
        if (pilha.isEmpty()) {
          return false; // Tentou fechar parêntese sem abrir
        }
        pilha.pop(); // Fecha um parêntese
      } else {
        // Caso haja algum caractere inválido
        return false;
      }
    }

    // Se a pilha estiver vazia, está tudo balanceado
    return pilha.isEmpty();
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite a expressão com parênteses: ");
    String entrada = scanner.nextLine();

    if (estaBalanceada(entrada)) {
      System.out.println("Parênteses balanceados!");
    } else {
      System.out.println("Parênteses desbalanceados.");
    }

    scanner.close();
  }
}
