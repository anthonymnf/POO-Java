package aulas.aula05.data;

import java.util.Scanner;

public class Data {
  int dia, mes, ano;

  boolean dataEhValida() {
    return (dia > 0 && dia <= 30 && mes > 0 & mes <= 12 && ano >= 0);
  }

  void inicializaData(int d, int m, int a) {
    dia = d;
    mes = m;
    ano = a;
  }

  void mostraData() {
    System.out.println(dia + "/" + mes + "/" + ano);
  }

  void recebendoData() {
    int d, m, a;
    Scanner input = new Scanner(System.in);
    System.out.print("Informe o dia:");
    d = input.nextInt();
    System.out.print("Informe o mes:");
    m = input.nextInt();
    System.out.print("Informe o ano:");
    a = input.nextInt();
    input.close();
    inicializaData(d, m, a);
  }
}
