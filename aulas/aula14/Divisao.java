package aulas.aula14;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Divisao {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n, d, res;

    try {
      System.out.print("Numerador: ");
      n = sc.nextInt();

      System.out.print("Denominador: ");
      d = sc.nextInt();

      res = divisao(n, d);

      System.out.println("Resultado: " + n + "/" + d + " = " + res);
    } catch (InputMismatchException ime) {
      System.out.println("Excecao: " + ime);
      System.out.println("A entrada deveria ser um numero inteiro. Por favor, tente novamente.");
    } catch (ArithmeticException ae) {
      System.out.println("Excecao: " + ae);
      System.out.println("Zero nao eh um denominador valido. Por favor, tente novamente.");
    } finally {
      sc.close();
    }
  }

  public static int divisao(int num, int den) {
    return num / den;
  }
}
