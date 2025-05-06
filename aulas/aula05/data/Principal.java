package aulas.aula05.data;

public class Principal {
  public static void main(String[] args) {
    Data data = new Data();
    data.recebendoData();
    boolean isValid;
    isValid = data.dataEhValida();
    if (isValid) {
      data.mostraData();
    } else {
      System.out.println("Data não é válida");
    }
  }
}
