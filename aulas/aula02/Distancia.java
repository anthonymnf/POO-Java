import java.util.Scanner;

public class Distancia {
  public static void main(String[] args) {
    double x1, y1, x2, y2, dist;
    Scanner entrada = new Scanner(System.in); //System.in é pq estou pegando do terminal
    System.out.print("x1: ");
    x1 = entrada.nextDouble();
    System.out.print("y1: ");
    y1 = entrada.nextDouble();
    System.out.print("x2: ");
    x2 = entrada.nextDouble();
    System.out.print("y2: ");
    y2 = entrada.nextDouble();
    //Fórmula: raizQuadrada((x2-x1)^2 + (y2-y1)^2)
    // Math.sqrt é para calcular a raiz quadrada e Math.pow para calcular expressões exponênciais
    dist = Math.sqrt(Math.pow(x2-x1, 2.0) + Math.pow(y2-y1, 2.0)) ;
    System.out.println("A distância entre ("+x1+", "+y1+") e ("+x2+", "+y2+") é "+dist);
    entrada.close();
  }
}
