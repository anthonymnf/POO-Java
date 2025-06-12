package aulas.aula11.concessionaria;

public class AutomovelDeLuxo extends AutomovelBasico {
  protected boolean arCondicionado, direcaoHidraulica;

  public AutomovelDeLuxo(String modelo, int ano, String cor, boolean airBag, boolean radio, boolean arCondicionado,
      boolean direcaoHidraulica) {
    super(modelo, ano, cor, airBag, radio);
    this.arCondicionado = arCondicionado;
    this.direcaoHidraulica = direcaoHidraulica;
  }

  @Override
  public float quantoCusta() {
    float custo = super.quantoCusta();
    return custo + (arCondicionado ? 1000F : 0F) + (direcaoHidraulica ? 20000F : 0F);
  }

  @Override
  public String toString() {
    String rep = "Modelo\nano: " + ano;
    rep += "\nmodelo: " + modelo;
    rep += "\ncor: " + cor;
    rep += "\nairbag: " + airBag;
    rep += "\nradio: " + radio;
    rep += "\narCondicionado: " + arCondicionado;
    rep += "\ndirecaoHidraulica: " + direcaoHidraulica;
    return rep;
  }

}
