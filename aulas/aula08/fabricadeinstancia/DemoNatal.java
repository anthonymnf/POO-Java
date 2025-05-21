package aulas.aula08.fabricadeinstancia;

public class DemoNatal {
  public static void main(String[] args) {
    // Aqui o objeto é criado mesmo assim, mas nem sempre queremos esse
    // comportamento
    Data d1 = new Data(-13, 12, 2023);
    System.out.println(d1);
    // Com a fábrica de instâncias conseguimos controlar a criação do objeto de uma
    // melhor forma
    Data d2 = Data.fabricaDeData(-13, 12, 2023);
    System.out.println(d2);
    Data d3 = Data.fabricaDeData(25, 12, 2024);
    System.out.println(d3);
    Data d4 = Data.fabricaDeNatal(2025);
    System.out.println(d4);
  }
}
