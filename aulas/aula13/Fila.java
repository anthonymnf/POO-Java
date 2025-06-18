package aulas.aula13;

import java.util.PriorityQueue;

public class Fila {
  public static void main(String[] args) {
    PriorityQueue<Double> fila = new PriorityQueue<Double>();
    fila.offer(9.5);
    fila.offer(1.5);
    fila.offer(7.5);
    fila.offer(3.5);
    fila.offer(5.5);
    System.out.println("Tamanho da fila: " + fila.size());
    System.out.println("Fila: " + fila);
    while (fila.size() > 0) {
      System.out.println(fila.poll());
    }
    System.out.println("Tamanho da fila: " + fila.size());
  }
}
