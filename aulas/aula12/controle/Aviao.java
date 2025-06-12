package aulas.aula12.controle;

public class Aviao extends Aereo {
  private int cadAviao;

  public Aviao(int capacidade, String cadANAC, int cadAviao) {
    super(capacidade, cadANAC);
    this.cadAviao = cadAviao;
  }

  public void moverFrente() {
    System.out.println("Aviao movendo para frente");
  }
}
