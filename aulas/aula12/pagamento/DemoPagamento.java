package aulas.aula12.pagamento;

public class DemoPagamento {
  public static void main(String[] args) {
    Fatura f = new Fatura(6.90, 11);
    EmpregadoAssalariado p1 = new EmpregadoAssalariado("Anthony", "13215cc1asdasa", 3000F);
    imprimiValorPagamento("Fatura:", f);
    imprimiValorPagamento("Salário de Anthony:", p1);

  }

  public static void imprimiValorPagamento(String text, Pagavel p) {
    System.out.printf("%s R$%.2f\n", text, p.getValorPagamento());
  }
}
