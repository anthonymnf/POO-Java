import java.util.Scanner;

public class BoasVindas {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    System.out.print("Nome:");
    String nome = entrada.nextLine();
    System.out.println("Bem vindo(a) "+nome);
    entrada.close();
  }
}
