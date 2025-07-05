package listas.lista01.resolução.Q64;

public class Main {
  public static void main(String[] args) {
    Pessoa pessoa = new Pessoa("Anthony", 22);
    Politico politico = new Politico("Lula", 99, "PT");
    Prefeito prefeito = new Prefeito("Lusimar", 45, "PMDB", "São Francisco do Oeste");
    Governador governadora = new Governador("Fátima", 55, "PT", "Rio Grande do Norte");
    System.out.println("Pessoa\n" + pessoa);
    System.out.println("\nPolitico\n" + politico);
    System.out.println("\nPrefeito\n" + prefeito);
    System.out.println("\nGovernadora\n" + governadora);
  }
}
