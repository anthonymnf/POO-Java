package listas.lista01.resolução.Q96;

class Paciente {
  private int rg;
  private int idade;

  public Paciente(int rg, int idade) {
    this.rg = rg;
    this.idade = idade;
  }

  public int getIdade() {
    return idade;
  }

  public int getRg() {
    return rg;
  }

  @Override
  public String toString() {
    return "Paciente RG: " + rg + ", Idade: " + idade;
  }
}
