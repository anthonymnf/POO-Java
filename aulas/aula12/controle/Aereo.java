package aulas.aula12.controle;

public abstract class Aereo extends Veiculo {
  private String cadANAC;

  public Aereo(int capacidade, String cadANAC) {
    super(capacidade);
    this.cadANAC = cadANAC;
  }
}
