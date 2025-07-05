package listas.lista01.resolução.Q64;

public class Pessoa {
  private String nome;
  private int idade;

  public Pessoa(String nome, int idade) {
    this.nome = nome;
    this.idade = idade;
  }

  public String toString() {
    return "Nome: " + nome + "\nIdade: " + idade + " anos";
  }
}
