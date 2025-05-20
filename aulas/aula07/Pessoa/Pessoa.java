package aulas.aula07.Pessoa;

public class Pessoa {
  private String nome;
  private double altura;

  public Pessoa(String nome, double altura) {
    this.nome = nome;
    this.altura = altura;
  }

  public String getNome() {
    return "Nome: " + nome;
  }

  public void setNome(String nome) {
    if (!nome.isEmpty()) {
      this.nome = nome;
    }
  }

  public double getAltura() {
    return altura;
  }

  public void setAltura(double altura) {
    this.altura = altura;
  }

  public String toString() {
    String res = "";
    res += "Nome" + nome;
    res += "\nAltura: " + altura;
      return res;
    }
}