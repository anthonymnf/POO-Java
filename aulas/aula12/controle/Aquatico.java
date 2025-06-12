package aulas.aula12.controle;

public abstract class Aquatico extends Veiculo {
  private double profundidade;

  public Aquatico(int capacidade, double profundidade) {
    super(capacidade);
    this.profundidade = profundidade;
  }
}
