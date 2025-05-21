package aulas.aula08.fabricadeinstancia;

public class Data {
  private int dia, mes, ano;

  public Data(int dia, int mes, int ano) {
    this.dia = dia;
    this.mes = mes;
    this.ano = ano;
    if (!dataEhValida()) {
      this.dia = 1;
      this.mes = 1;
      this.ano = 2000;
    }
  }

  public static Data fabricaDeNatal(int ano) {
    return new Data(25, 12, ano);
  }

  public static Data fabricaDeData(int dia, int mes, int ano) {
    if (dia > 0 && dia <= 30 && mes > 0 & mes <= 12 && ano >= 0) {
      return new Data(dia, mes, ano);
    } else {
      return null;
    }
  }

  private boolean dataEhValida() {
    return (dia > 0 && dia <= 30 && mes > 0 & mes <= 12 && ano >= 0);
  }

  @Override
  public String toString() {
    return "Data:" + dia + "/" + mes + "/" + ano;
  }

}
