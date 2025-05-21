package aulas.aula08.classegenerica;

public class Tupla<F, S> {
  private F primeiroAtributo;
  private S segundoAtributo;

  public Tupla(F primeiroAtributo, S segundoAtributo) {
    this.primeiroAtributo = primeiroAtributo;
    this.segundoAtributo = segundoAtributo;
  }

  public void setPrimeiroAtributo(F primeiroAtributo) {
    this.primeiroAtributo = primeiroAtributo;
  }

  public void setSegundoAtributo(S segundoAtributo) {
    this.segundoAtributo = segundoAtributo;
  }

  public F getPrimeiroAtributo() {
    return primeiroAtributo;
  }

  public S getSegundoAtributo() {
    return segundoAtributo;
  }

  @Override
  public String toString() {
    return "primeiroAtributo=" + primeiroAtributo + ", segundoAtributo=" + segundoAtributo;
  }

}
