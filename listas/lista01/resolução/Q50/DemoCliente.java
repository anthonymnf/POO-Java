package listas.lista01.resolução.Q50;

import java.util.ArrayList;
import java.util.Scanner;

public class DemoCliente {
  public static void main(String[] args) {
    ArrayList<Cliente> clientes = new ArrayList<>();
    Scanner input = new Scanner(System.in);
    while (true) {
      int id;
      System.out.print("Digite o ID do cliente (negativo para parar): ");
      id = input.nextInt();
      input.nextLine(); // limpar buffer
      if (id < 0)
        break;
      System.out.print("Nome: ");
      String nome = input.nextLine();

      System.out.print("Idade: ");
      int idade = input.nextInt();
      input.nextLine(); // limpar buffer

      System.out.print("Telefone: ");
      String telefone = input.nextLine();

      Cliente cliente = new Cliente(id, idade, nome, telefone);
      clientes.add(cliente);
      System.out.println("Cliente cadastrado!\n");
    }
    System.out.println("\n- Lista de clientes cadastrados:");
    for (Cliente cliente : clientes) {
      System.out.println(cliente);
    }
    input.close();
  }
}
