package aulas.aula12.controle;

public abstract class Veiculo {
  private int capacidade;

  public Veiculo(int capacidade) {
    this.capacidade = capacidade;
  }

  public abstract void moverFrente();
}
