package aulas.aula03;

import java.util.Scanner;
import java.util.Calendar;

public class Cartao {
  public static void main(String[] args) {
    String nome;
    int num, cod, mes, ano, mesAtual, anoAtual;
    Scanner ent = new Scanner(System.in);
    Calendar calendario = Calendar.getInstance();
    boolean dataInvalida;
    mesAtual = 1 + calendario.get(Calendar.MONTH);
    anoAtual = calendario.get(Calendar.YEAR);

    System.out.print("Nome: ");
    nome = ent.nextLine();
    System.out.print("Numero: ");
    num = ent.nextInt();
    System.out.print("Codigo: ");
    cod = ent.nextInt();

    do {
      System.out.print("Mes da validade: ");
      mes = ent.nextInt();
      System.out.print("Ano da validade: ");
      ano = ent.nextInt();
      dataInvalida = (ano < anoAtual) || (ano == anoAtual && mes < mesAtual);
      if (dataInvalida) {
        System.out.println("Dados invalidos");
      }
    } while (dataInvalida);

    System.out.println("Dados validos");

    ent.close();
  }
}
