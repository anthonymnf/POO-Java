package listas.lista01.resolução.Q103;

import java.util.Scanner;

public class NomeDoMes {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String[] meses = {
        "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
        "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"
    };

    try {
      System.out.print("Digite um número de 1 a 12: ");
      int numero = Integer.parseInt(scanner.nextLine());

      // Subtrai 1 porque os índices começam em 0
      System.out.println("📅 Mês correspondente: " + meses[numero - 1]);

    } catch (NumberFormatException e) {
      System.out.println("❌ Erro: entrada não é um número inteiro válido.");
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("❌ Erro: número fora da faixa de 1 a 12.");
    }

    scanner.close();
  }
}
