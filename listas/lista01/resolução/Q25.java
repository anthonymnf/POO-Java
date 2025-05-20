package listas.lista01.resolução;

public class Q25 {
  public static void main(String[] args) {
    System.out.println(proc(5));
  }

  public static int proc(int k) {
    if (k > 0)
      return proc(k - 2) + proc(k - 1);

    return 1;
  }

}
