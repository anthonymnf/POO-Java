package listas.lista01.resolução;

import java.util.Scanner;

public class Q3 {
  public static void main(String[] args) {
    double anguloGraus, anguloRad, sen, cos, tg, cossec, sec, cotg;
    Scanner input = new Scanner(System.in);
    System.out.print("Informe um ângulo em graus: ");
    anguloGraus = input.nextDouble();
    anguloRad = Math.toRadians(anguloGraus);
    System.err.println("O angulo em radianos é: " + anguloRad);
    sen = Math.sin(anguloRad);
    cos = Math.cos(anguloRad);
    tg = Math.tan(anguloRad);
    cossec = 1.0 / sen;
    sec = 1.0 / cos;
    cotg = 1.0 / tg;
    System.out.println("Seno: " + sen);
    System.out.println("Cosseno: " + cos);
    System.out.println("Tangente: " + tg);
    System.out.println("Cosecante: " + cossec);
    System.out.println("Secante: " + sec);
    System.out.println("Cotangente: " + cotg);
    input.close();
  }
}
