package aulas.aula08.metodogenerico;

public class DamoIgual {
  public static void main(String[] args) {
    // O bom de métodos genéricos é poder usar qualquer tipo de dado, sem a
    // necessidade de criar um método para cada tipo de dado
    if (Iguais.ehIgual("Ufersa", "Ufersa")) {
      System.out.println("Os dois dados são iguais");
    } else {
      System.out.println("Os dois dados não são iguais");
    }
  }
}
