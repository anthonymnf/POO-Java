package aulas.aula13;

import java.util.Stack;

public class Pilha {
  public static void main(String[] args) {
    Stack<Number> pilha = new Stack<>();
    pilha.push(1.5);
    pilha.push(3.1);
    pilha.push(45);
    pilha.push(50);
    pilha.push(151);
    pilha.push(2);
    System.out.println("Pilha: " + pilha);
    while (!pilha.isEmpty()) {
      System.out.println("Topo da piha: " + pilha.peek());
      System.out.println("Removido: " + pilha.pop());
    }
  }

}
