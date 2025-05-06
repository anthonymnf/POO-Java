package aulas.aula05.triangulo;

public class DemoTriangulo {
  public static void main(String[] args) {
    Triangulo t1 = new Triangulo();
    t1.inicializaTriangulo(2.3, 3.3, 4.5, "escaleno");
    Triangulo t2 = new Triangulo();
    t2.inicializaTriangulo(2.3, 3.3, 4.5, "escaleno");
    Triangulo t3 = t1;
    System.out.println(t1 == t2); // Apesar de serem os mesmos valores, o endereço na memória é diferente
    System.out.println(t1 == t3); // Possuem o mesmo endereço na memória, por isso que dá true
    t3.l1 = 10;
    System.out.println(t1.l1); // O valor tbm é alterado, pois como possui o mesmo endereço se alterar o t3 tbm
                               // altera t1
    System.out.println(t3.l1);

  }
}
