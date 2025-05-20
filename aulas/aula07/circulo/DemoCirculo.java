package aulas.aula07.circulo;

public class DemoCirculo {
  public static void main(String[] args) {
    Circulo c1 = new Circulo(50);
    Circulo c2 = new Circulo(60);
    Circulo c3 = new Circulo(25);
    System.out.println(c1);
    System.out.println(c2);
    System.out.println("Perímetro Círculo 3 = " + c3.perimetro());
  }
}
