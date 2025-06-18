package aulas.aula13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class Interator {
  public static void main(String[] args) {
    ArrayList<Double> notas = new ArrayList<>(Arrays.asList(5.5, 6.5, 7.5, 8.5));
    Iterator<Double> iterator = notas.iterator();

    imprimeCollection(notas);
    while (iterator.hasNext()) {
      if (iterator.next() < 7.0) {
        iterator.remove();
      }
    }
    imprimeCollection(notas);
  }

  private static void imprimeCollection(Collection<Double> collec) {
    for (Double elemento : collec) {
      System.out.print(elemento + " ");
    }
    System.out.println();
  }
}
