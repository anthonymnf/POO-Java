package aulas.aula05.faculdade;

public class DemoRegistroAcademico {
  public static void main(String[] args) {
    RegistroAcademico michael = new RegistroAcademico();
    michael.inicializaRegistroAcademicio("Michael", "0003", 2, 60);
    double valor = michael.calculaMensalidade();
    System.out.println("Valor da mensalidade é: " + valor);

    RegistroAcademico roberto = new RegistroAcademico();
    double valor2 = roberto.calculaMensalidade();
    System.out.println("Valor da mensalidade é: " + valor2);
  }
}
