package listas.lista01.resolução.Q65;

public class Funcionario {
  private String nome;
  private float salario;

  public Funcionario(String nome, float salario) {
    this.nome = nome;
    this.salario = salario;
  }

  public void aumentarSalario(float aumento) {
    salario += aumento;
  }

  public float ganhoAnual() {
    return salario * 13;
  }

  public String toString() {
    return "Funcionário\nNome: " + nome + "\nSalário: R$" + salario;
  }

  public float getSalario() {
    return salario;
  }

}
