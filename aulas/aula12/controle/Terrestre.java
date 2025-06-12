package aulas.aula12.controle;

public abstract class Terrestre extends Veiculo {
  private int qtdRodas;

  public Terrestre(int capacidade, int qtdRodas) {
    super(capacidade);
    this.qtdRodas = qtdRodas;
  }
}
