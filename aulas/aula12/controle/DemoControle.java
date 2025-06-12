package aulas.aula12.controle;

public class DemoControle {
  public static void main(String[] args) {
    Aviao a = new Aviao(10, "asa798", 26464);
    Barco b = new Barco(5, 14.8, "jkhvbs98");
    Carro c = new Carro(5, 4, "qui7809");

    System.out.println(c);
    Controle.controlar(c);
    Controle.controlar(a);
    Controle.controlar(b);
    Controle.controlar(c);
  }
}
