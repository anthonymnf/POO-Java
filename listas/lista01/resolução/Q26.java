package listas.lista01.resolução;

public class Q26 {
  public class Main {
    public static void main(String[] args) {
      for (int i = 0; i <= 10; i++) {
        if (i == 4) {
          break;
        } else if (i % 2 == 0) {
          continue;
        }
        System.out.println(i);
      }
    }
  }
}
