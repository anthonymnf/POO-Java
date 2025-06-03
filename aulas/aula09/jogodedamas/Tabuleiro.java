package aulas.aula09.jogodedamas;

public class Tabuleiro {
  private char tab[][];
  private static final int LIN = 8;
  private static final int COL = 8;

  public Tabuleiro() {
    tab = new char[LIN][COL];
    for (int l = 0; l < tab.length; l++) { // tab.length pega o tamanho da primeira dimensão
      for (int c = 0; c < tab[l].length; c++) {
        tab[l][c] = '.';
      }
    }
    // Time o
    for (int l = 0; l <= 2; l++) {
      for (int c = l % 2; c < tab[l].length; c += 2) {
        tab[l][c] = 'o';
      }
    }
    // Time x
    for (int l = 5; l <= 7; l++) {
      for (int c = l % 2; c < tab[l].length; c += 2) {
        tab[l][c] = 'x';
      }
    }
  }

  @Override
  public String toString() {
    String rep = "";
    for (int l = 0; l < tab.length; l++) { // tab.length pega o tamanho da primeira dimensão
      for (int c = 0; c < tab[l].length; c++) {
        rep += tab[l][c] + " ";
      }
      rep += "\n";
    }
    return rep;
  }

}
