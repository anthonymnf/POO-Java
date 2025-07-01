package listas.lista01.resolução.Q61;

public class Equipamento {
  private String nome;
  private float preco;

  public Equipamento(String nome, float preco) {
    this.nome = nome;
    this.preco = preco;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public float getPreco() {
    return preco;
  }

  public void setPreco(float preco) {
    this.preco = preco;
  }

  @Override
  public String toString() {
    return "Dados:\n-Nome=" + nome + "\n-Preco=" + preco;
  }

}
