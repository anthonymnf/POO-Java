package aulas.aula08.metodogenerico;

public class Iguais {
  public static <T> boolean ehIgual(T dado1, T dado2) {
    return dado1.equals(dado2);
  }
}
