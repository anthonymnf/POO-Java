package aulas.aula13;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;

public class Lista {
  public static void main(String[] args) {
    LinkedList<String> lista1 = new LinkedList<>(
        Arrays.asList("azul", "verde", "vermelho", "preto", "cinza", "laranja", "rosa"));
    LinkedList<String> lista2 = new LinkedList<>(Arrays.asList("preto", "branco", "laranja", "roxo"));
    System.out.println("Lista 1: " + lista1);
    System.out.println("Lista 2: " + lista2);
    remove(lista1, lista2);

    System.out.println("Lista 1: " + lista1);
  }

  public static void remove(LinkedList<String> lista1, LinkedList<String> lista2) {
    String elemento;
    ListIterator<String> iterator = lista1.listIterator();
    while (iterator.hasNext()) {
      elemento = iterator.next();
      if (lista2.contains(elemento)) {
        iterator.remove();
      }
    }
  }

  // Forma 2: É mais elegante e concisa
  public static void removeV2(LinkedList<String> lista1, LinkedList<String> lista2) {
    lista1.removeIf(lista2::contains);
    // Explicação:
    // removeIf(...) percorre a lista e remove qualquer elemento que satisfaça a
    // condição.
    // lista2::contains é uma referência de método, equivalente a: e ->
    // lista2.contains(e)
  }

}
