package aulas.aula07.circulo;

public class Circulo {
  private double raio;
  private static final double pi = Math.PI;

  public Circulo(double raio) {
    this.raio = raio;
  }

  public double perimetro() {
    return this.raio * pi * 2;
  }

  @Override
  public String toString() {
    return "raio=" + raio;
  }

}
