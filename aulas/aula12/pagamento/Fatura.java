package aulas.aula12.pagamento;

public class Fatura implements Pagavel {
  private double precoUnidade;
  private int quantidade;

  public Fatura(double precoUnidade, int quantidade) {
    this.precoUnidade = precoUnidade;
    this.quantidade = quantidade;
  }

  @Override
  public double getValorPagamento() {
    return precoUnidade * quantidade;
  }
}
