package aulas.aula11.concessionaria;

public class DemoConcessionario {
  public static void main(String[] args) {
    AutomovelDeLuxo auto = new AutomovelDeLuxo("ferrari", 2024, "vermelho", true, true, true, true);
    System.out.println(auto);
    System.out.println("Valor: R$" + auto.quantoCusta());
  }
}
