package listas.lista01.resolução;

import java.util.Scanner;

public class Q9 {
  public static void main(String[] args) {
    int valorDaCarta, naipe;
    Scanner input = new Scanner(System.in);
    System.out.print("Insira o valor da carta: ");
    valorDaCarta = input.nextInt();
    System.out.print("Insira o naipe da carta (1=Ouros, 2=Paus, 3=Copas, 4=Espadas): ");
    naipe = input.nextInt();
    String nomeValor = "";
    String nomeNaipe = "";

    // Determina o nome da carta
    switch (valorDaCarta) {
      case 1:
        nomeValor = "Ás";
        break;
      case 11:
        nomeValor = "Valete";
        break;
      case 12:
        nomeValor = "Dama";
        break;
      case 13:
        nomeValor = "Rei";
        break;
      default:
        if (valorDaCarta >= 2 && valorDaCarta <= 10) {
          nomeValor = String.valueOf(valorDaCarta);
        } else {
          System.out.println("Valor da carta inválido.");
          input.close();
          return;
        }
    }

    // Determina o nome do naipe
    switch (naipe) {
      case 1:
        nomeNaipe = "Ouros";
        break;
      case 2:
        nomeNaipe = "Paus";
        break;
      case 3:
        nomeNaipe = "Copas";
        break;
      case 4:
        nomeNaipe = "Espadas";
        break;
      default:
        System.out.println("Naipe inválido.");
        input.close();
        return;
    }

    // Imprime o resultado
    System.out.println("A carta é: " + nomeValor + " de " + nomeNaipe + ".");
    input.close();
  }
}
