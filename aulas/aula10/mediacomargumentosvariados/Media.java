package aulas.aula10.mediacomargumentosvariados;

public class Media {
  public static void main(String[] args) {
    double media10 = media(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    System.out.println("Média dos 10 elementos é " + media10);
  }

  public static double media(double... num) { // O num é interpretado como um array
    double sum = 0;
    for (double d : num) { // A cada interação o "d" recebe um valor de "num"
      sum += d;
    }
    return sum / num.length;
  }
}
