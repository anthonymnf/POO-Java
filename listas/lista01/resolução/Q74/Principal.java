package listas.lista01.resolução.Q74;

public class Principal {
  public static void main(String[] args) {
    // Primeiro desenho: Círculo e Quadrado
    Desenho d1 = new Desenho(
        new Circulo(), 2, 3,
        new Quadrado(), 5, 1);

    // Segundo desenho: Quadrado e Triângulo
    Desenho d2 = new Desenho(
        new Quadrado(), 0, 0,
        new Triangulo(), -2, 4);

    System.out.println("Desenho 1:");
    d1.apresenta();

    System.out.println("Desenho 2:");
    d2.apresenta();
  }
}
