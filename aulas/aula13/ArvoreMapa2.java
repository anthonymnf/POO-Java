package aulas.aula13;

import java.util.*;

public class ArvoreMapa2 {
  public static void main(String[] args) {
    TreeMap<String, Integer> mapa = new TreeMap<>();
    String texto = "Lorem ipsum dolor sit amet consectetur adipiscing elit Cras consequat libero sit amet mi aliquam sollicitudin Nulla libero lectus laoreet congue pulvinar at pharetra ut lorem Integer sed leo ut urna finibus porttitor Nulla ornare ac ex ac consectetur Sed porta turpis id iaculis aliquam ex massa consectetur elit eu tristique ex eros dapibus eros Etiam rhoncus enim et tellus commodo lobortis pulvinar eget nisl Class aptent taciti sociosqu ad litora torquent per conubia nostra per inceptos himenaeos Sed cursus a lorem nec feugiat";

    // Separar as palavras
    String[] palavras = texto.split(" ");
    System.out.println("- Array de palavras:");
    System.out.println(Arrays.toString(palavras));
    System.out.println();

    // Contar as palavras
    for (String palavra : palavras) {
      String palavraMin = palavra.toLowerCase();
      mapa.put(palavraMin, mapa.getOrDefault(palavraMin, 0) + 1);
    }

    // Exibir palavras em ordem alfabética
    System.out.println("- Palavras em ordem alfabética com suas frequências:");
    for (String palavra : mapa.keySet()) {
      System.out.printf("%-15s %d%n", palavra, mapa.get(palavra));
    }

    System.out.println();

    // Ordenar por frequência (valor) em ordem decrescente
    System.out.println("- Palavras em ordem de frequência (da maior para a menor):");
    List<Map.Entry<String, Integer>> listaOrdenada = new ArrayList<>(mapa.entrySet());
    listaOrdenada.sort((a, b) -> b.getValue().compareTo(a.getValue())); // ordem decrescente

    for (Map.Entry<String, Integer> entrada : listaOrdenada) {
      System.out.printf("%-15s %d%n", entrada.getKey(), entrada.getValue());
    }
  }
}
