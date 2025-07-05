package listas.lista01.resolução.Q64;

public class Prefeito extends Politico {
  private String cidade;

  public Prefeito(String nome, int idade, String partido, String cidade) {
    super(nome, idade, partido);
    this.cidade = cidade;
  }

  public String toString() {
    return super.toString() + "\nCidade chefiada: " + cidade;
  }
}
