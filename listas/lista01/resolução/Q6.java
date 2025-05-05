package listas.lista01.resolução;

import java.util.Scanner;

public class Q6 {
  public static void main(String[] args) {
    int totalMin, dias, horas, minutos;
    Scanner input = new Scanner(System.in);
    System.out.print("Informe a quantidade de minutos: ");
    totalMin = input.nextInt();
    dias = totalMin / (24 * 60);
    horas = (totalMin - dias * 24 * 60) / 60;
    minutos = totalMin - (dias * 24 * 60) - (horas * 60);
    System.out.print(totalMin + " minutos = " + dias + " dias, " + horas + " horas, " + minutos + " minutos.");
    input.close();
  }
}
