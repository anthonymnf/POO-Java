import java.util.Scanner;

public class Data {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    int dia, mes, ano, diasDoMes;
    System.out.print("Dia: ");
    dia = leitor.nextInt();
    System.out.print("Mês: ");
    mes  = leitor.nextInt();
    System.out.print("Ano: ");
    ano  = leitor.nextInt();
    // Verificando erros:
    if (dia>31 || mes>12 || dia<0 || mes<0) {
      System.out.println("Data informada não existe!\nEncerrando o programa...");
      leitor.close();
      return;
    }
    System.out.print(dia+" de ");
    if (mes == 1) {
      System.out.print("janeiro");
    } else if (mes == 2) {
      System.out.print("fevereiro");
    }else if (mes == 3) {
      System.out.print("março");
    }else if (mes == 4) {
      System.out.print("abril");
    }else if (mes == 5) {
      System.out.print("maio");
    }else if (mes == 6) {
      System.out.print("junho");
    }else if (mes == 7) {
      System.out.print("julho");
    }else if (mes == 8) {
      System.out.print("agosto");
    }else if (mes == 9) {
      System.out.print("setembro");
    }else if (mes == 10) {
      System.out.print("outubro");
    }else if (mes == 11) {
      System.out.print("novembro");
    }else if (mes == 12) {
      System.out.print("dezembro");
    } 
    System.out.println(" "+ano);
    switch (mes) {
      case 1, 3, 5, 7, 8, 10, 12:
        diasDoMes =31;
        break;
      case 2:
        diasDoMes =28;
        break;
    
      default:
        diasDoMes = 30;
        break;
    }
    System.out.println("O mês informado tem "+diasDoMes+" dias");
    leitor.close();
  }
}
