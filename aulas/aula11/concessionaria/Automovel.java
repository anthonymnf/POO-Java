package aulas.aula11.concessionaria;

public class Automovel {

  protected String modelo;
  protected int ano;
  protected String cor;

  public Automovel(String modelo, int ano, String cor) {
    this.modelo = modelo;
    this.ano = ano;
    this.cor = cor;
  }

  public float quantoCusta() {
    return (ano < 2010 ? 50000F : 70000F);
  }
}
