package listas.lista01.resolução.Q49;

public class DemoMatriz {
  public static void main(String[] args) {
    Matriz m1 = new Matriz(1, 2, 3, 4);
    System.out.println("Matriz:");
    m1.imprimirMatriz();
    System.out.printf("Determinante: %.2f", m1.CalcularDeterminante());
  }
}
