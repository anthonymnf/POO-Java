package listas.lista01.resolução.Q51;

public class Operacoes {
  public static int produto(int... numeros) {
    int resultado = 1;
    for (int i : numeros) {
      resultado *= i;
    }
    return resultado;
  }
}
