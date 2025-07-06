package listas.lista01.resolução.Q94;

import java.util.Map;
import java.util.TreeMap;

public class Q94 {
  public static void main(String[] args) {
    Map<Character, Integer> mapaLetras = new TreeMap<>();
    String texto = "hello THERE";
    texto = texto.toUpperCase();
    for (int i = 0; i < texto.length(); i++) {
      char c = texto.charAt(i);

      if (Character.isLetter(c)) {
        mapaLetras.put(c, mapaLetras.getOrDefault(c, 0) + 1);
      }
    }

    System.out.println("Ocorrências de letras:");
    for (Map.Entry<Character, Integer> entry : mapaLetras.entrySet()) {
      System.out.println(entry.getKey() + ": " + entry.getValue());
    }
  }
}
