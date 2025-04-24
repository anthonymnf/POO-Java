import java.text.DecimalFormat;

public class UnidadesDeVelocidade {
  public static void main(String[] args) {
    double kph = 0.0, mps;
    System.out.println("k/h\tmps\t");
    // Tarefa de casa: Usar o JavaAPI para formatar os números da tabela e deixar
    // com um número de dígitos fixos
    DecimalFormat df = new DecimalFormat("00.0000");
    while (kph <= 50.0) {
      mps = kph * 0.2778;
      System.out.println(String.format("%05.2f", kph) + "\t" + df.format(mps) + "\t");
      kph += 0.5;
    }

  }
}
