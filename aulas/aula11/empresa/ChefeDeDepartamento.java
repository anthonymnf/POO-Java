package aulas.aula11.empresa;

public class ChefeDeDepartamento extends Funcionario {
  private String departamento;

  public ChefeDeDepartamento(String nome, String identidade, float salario, String departamento) {
    super(nome, identidade, salario);
    this.departamento = departamento;
  }

  public String getDepartamento() {
    return departamento;
  }

  public String toString() {
    return super.toString() + "\nDepartamento: " + departamento;
  }
}
