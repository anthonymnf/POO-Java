package listas.lista01.resolução;

public class Q17 {
  public static void main(String[] args) {
    double popA = 7000;
    double popB = 20000;
    int anos = 0;

    while (popA < popB) {
      popA += popA * 0.035;
      popB += popB * 0.01;
      anos++;
    }
    System.out.println(
        "Serão necessários " + anos + " anos para que a população da cidade A seja maior ou igual à da cidade B.");
    System.out.printf("População final de A: %.0f\n", popA);
    System.out.printf("População final de B: %.0f\n", popB);
  }
}
