package aulas.aula13;

import java.util.TreeSet;

public class Conjunto {
  public static void main(String[] args) {
    TreeSet<String> cores = new TreeSet<>();
    String corRef = "preto";
    cores.add("preto");
    cores.add("azul");
    cores.add("preto");
    cores.add("preto");
    cores.add("laranja");
    cores.add("rosa");
    cores.add("vermelho");
    cores.add("cinza");
    System.out.println(cores);
    System.out.println("Antes de " + corRef + ": " + cores.headSet(corRef));
    System.out.println("Depois de " + corRef + ": " + cores.tailSet(corRef));
    System.out.println("1º: " + cores.first());
    System.out.println("nº: " + cores.last());

  }
}
