package aulas.aula10.pascal;

import java.util.Scanner;

public class Pascal {
  public static void main(String[] args) {
    int nLinhas;
    Scanner sc = new Scanner(System.in);
    System.out.print("Linhas: ");
    nLinhas = sc.nextInt();
    int[][] tri = new int[nLinhas][];

    for (int l = 0; l < nLinhas; l++) {
      tri[l] = new int[l + 1]; // Cada linha tem l + 1 elementos
      tri[l][0] = 1;
      tri[l][l] = 1;

      for (int c = 1; c < l; c++) {
        tri[l][c] = tri[l - 1][c - 1] + tri[l - 1][c];
      }
    }

    for (int l = 0; l < nLinhas; l++) {
      for (int c = 0; c <= l; c++) {
        System.out.print(tri[l][c] + " ");
      }
      System.out.println(); // Quebra de linha após cada linha do triângulo
    }

    sc.close();
  }
}
