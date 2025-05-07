package listas.lista01.resolução;

public class Q16 {
  public static void main(String[] args) {
    int n, d, c, u;
    for (int i = 100; i < 1000; i++) {
      c = i / 100;
      d = (i / 10) % 10;
      u = i % 10;
      n = (int) (Math.pow(c, 3) + Math.pow(d, 3) + Math.pow(u, 3));
      if (n == i) {
        System.out.println(n);
      }
    }
  }
}
