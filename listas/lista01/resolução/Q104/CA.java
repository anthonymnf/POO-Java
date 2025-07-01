package listas.lista01.resolução.Q104;

public class CA {
  int val = 0;

  public void op1(int x) {
    val += x;
  }

  public void op2(int x, int y) {
    val -= x + y;
  }

  int getVal() {
    return val;
  }
}
