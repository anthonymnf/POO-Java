package listas.lista01.resolução;

public class Q27 {
  public static void main(String[] args) {
    int a = 100;
    int b = 10;
    double c = 10.5;
    a = b = (int) c;
    System.out.print(" | " + a++ + " | ");
    if (a++ < 12 || ++b > 5) {
      System.out.print(b + " | ");
    } else {
      System.out.println(c + " | ");
    }
  }

}
