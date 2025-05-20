package aulas.aula07.filabanco;

public class CaixaBanco {
  public static int clientesAtendidos = 0;
  private int numeroCaixa;

  public CaixaBanco(int numeroCaixa) {
    this.numeroCaixa = numeroCaixa;
  }

  public void iniciaAtendimento() {
    System.out.println("Caixa" + numeroCaixa + "atendendo o cliente " + ++clientesAtendidos);
  }

  @Override
  public String toString() {
    return "numeroCaixa =" + numeroCaixa;
  }

}
