package listas.lista01.resolução.Q72;

public class Main {
  public static void main(String[] args) {
    Funcionario f1 = new Funcionario("Johnny");
    Funcionario f2 = new Funcionario("Anthony", 5F);

    System.out.println(f1);
    System.out.println("\n----------------------\n");
    System.out.println(f2);
    System.out.println("\n----------------------\n");
    f1.mudancaDeCargo("Técnico");
    f1.aumentarSalarioPorHora(1F);
    System.out.println(f1);
    System.out.println("\n----------------------\n");
    f2.aumentarSalarioPorHora(1F);
    System.out.println(f2);
    System.out.println("\n----------------------\n");
  }
}
