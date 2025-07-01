package listas.lista01.resolução.Q61;

public class TestaEquipamento {
  public static void main(String[] args) {
    Equipamento eq = new Equipamento("Cadeira", 25.50F);
    System.out.println(eq);
    Computador comp = new Computador("PC", 5000F, "Ryzen7", "512GB", "16GB");
    System.out.println("---------------------\n");
    System.out.println(comp);
  }
}
