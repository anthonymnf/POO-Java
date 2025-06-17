package aulas.aula12.pagamento;

public class EmpregadoAssalariado extends Empregado {
  private double salario;

  public EmpregadoAssalariado(String nome, String ctps, double salario) {
    super(nome, ctps);
    this.salario = salario;
  }

  @Override
  public double getValorPagamento() {
    return salario;
  }

}
