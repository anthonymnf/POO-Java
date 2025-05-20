package listas.lista01.resolução;

public class Q28 {
  public static void main(String[] args) {
    int a, b;
    a = 1;
    b = 2;
    while (a < 7) {
      a = b + a;
      do {
        b = a + b;
        a = a + 1;
      } while (b < 9);
    }
    System.out.println(a + " e " + b);
  }
}
