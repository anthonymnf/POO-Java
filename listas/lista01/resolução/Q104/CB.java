package listas.lista01.resolução.Q104;

public class CB extends CA {
  public void op1(int x) {
    val -= x;
  }

  public void op2(int x, int y) {
    try {
      val += x / y;
    } catch (Exception e) {
      val = 10;
    } finally {
      val++;
    }
  }
}
