package listas.lista01.resolução;

public class Q13 {
  public static void main(String[] args) {
    int totalDeNumeros = 60;
    int totalDeLinhas = 10;
    for (int i = 1; i <= totalDeNumeros; i++) {
      System.out.printf("%02d  ", i);
      if (i % totalDeLinhas == 0) {
        System.out.println();
      }
    }
  }
}
