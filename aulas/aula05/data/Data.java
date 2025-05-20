package aulas.aula05.data;

import java.util.Scanner;

public class Data {
  private int dia, mes, ano;

  private boolean dataEhValida() {
    return (dia > 0 && dia <= 30 && mes > 0 & mes <= 12 && ano >= 0);
  }

  private void inicializaData(int d, int m, int a) {
    dia = d;
    mes = m;
    ano = a;
    if (!this.dataEhValida()) {
      dia = 1;
      mes = 1;
      ano = 2000;
    }
  }

  public void mostraData() {
    System.out.println(dia + "/" + mes + "/" + ano);
  }

  public void recebendoData() {
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
