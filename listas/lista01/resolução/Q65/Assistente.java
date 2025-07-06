package listas.lista01.resolução.Q65;

public class Assistente extends Funcionario {
  private int numMatricula;

  public Assistente(String nome, float salario, int numMatricula) {
    super(nome, salario);
    this.numMatricula = numMatricula;
  }

  public String toString() {
    return super.toString() + "\nNúmero de matrícula: " + numMatricula;
  }

  public int getNumMatricula() {
    return numMatricula;
  }

  public void setNumMatricula(int numMatricula) {
    this.numMatricula = numMatricula;
  }

}
