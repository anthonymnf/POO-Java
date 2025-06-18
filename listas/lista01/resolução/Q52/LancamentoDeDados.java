package listas.lista01.resolução.Q52;

import java.util.Random;

public class LancamentoDeDados {
  public static void main(String[] args) {
    Random random = new Random();
    int frequencias[] = new int[13];
    for (int i = 0; i < 36000000; i++) {
      int dado1 = 1 + random.nextInt(6);
      int dado2 = 1 + random.nextInt(6);
      int soma = dado1 + dado2;
      frequencias[soma]++;
    }
    System.out.println("Soma\tFrequência\tPorcentagem");
    for (int i = 2; i < 12; i++) {
      double porcentagem = (frequencias[i] * 100) / 36000000;
      System.out.printf("%d\t%d\t\t%.2f%%\n", i, frequencias[i], porcentagem);
    }
  }
}
