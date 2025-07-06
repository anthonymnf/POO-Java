package listas.lista01.resolução.Q93;

import java.util.LinkedList;

public class Q93 {
  public static void main(String[] args) {
    LinkedList<Character> lista = new LinkedList<>();
    char[] letras = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J' };
    for (char elemento : letras) {
      lista.add(elemento);
    }
    LinkedList<Character> listaCopy = new LinkedList<>();
    for (int i = lista.size() - 1; i >= 0; i--) {
      listaCopy.add(lista.get(i));
    }
    System.out.println("Lista original: " + lista);
    System.out.println("Lista invertida: " + listaCopy);
  }
}
