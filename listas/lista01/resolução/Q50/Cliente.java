package listas.lista01.resolução.Q50;

public class Cliente {
  private int id, idade;
  private String nome, telefone;

  public Cliente(int id, int idade, String nome, String telefone) {
    this.id = id;
    this.idade = idade;
    this.nome = nome;
    this.telefone = telefone;
  }

  public String toString() {
    return String.format("ID: %d | Nome: %s | Idade: %d | Telefone: %s", id, nome, idade, telefone);
  }

}
