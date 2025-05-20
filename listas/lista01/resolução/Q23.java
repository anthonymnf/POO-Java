package listas.lista01.resolução;

import java.util.Scanner;

public class Q23 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Entre com a media, de 0 a 10: ");
    float media_aluno = input.nextFloat();
    System.out.println("Entre com a frequencia de 0 a 1 (indicando 100%): ");
    float frequencia = input.nextFloat();
    float media = 7;
    float frequencia_minima = 0.75f;
    if (media_aluno >= media && frequencia >= frequencia_minima) {
      System.out.println("Voce foi aprovado!");
    } else if (media_aluno >= media) {
      System.out.println("Solicite aprovacao mediante justificativa de faltas.");
    } else if (frequencia >= frequencia_minima) {
      float recuperar = media * 2 - media_aluno;
      if (recuperar <= 10)
        System.out.println("Esta em recuperacao, tirar no minimo " + recuperar);
      else
        System.out.println("Nao esta apto para recuperacao.");
    } else {
      System.out.println("Voce esta reprovado.");
    }
    input.close();
  }
}
