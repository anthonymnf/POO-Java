package aulas.aula11.concessionaria;

public class AutomovelBasico extends Automovel {
  protected boolean airBag, radio;

  public AutomovelBasico(String modelo, int ano, String cor, boolean airBag, boolean radio) {
    super(modelo, ano, cor);
    this.airBag = airBag;
    this.radio = radio;
  }

  @Override
  public float quantoCusta() {
    float custo = super.quantoCusta();
    return custo + (airBag ? 15000F : 0F) + (radio ? 2000F : 0F);
  }

}
