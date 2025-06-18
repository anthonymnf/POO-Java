package aulas.aula13;

import java.util.ArrayList;
import java.util.Collections;

public class Busca {
  public static void main(String[] args) {
    ArrayList<String> lista = new ArrayList<>();
    lista.add("vermelho");
    lista.add("azul");
    lista.add("roxo");
    lista.add("cinza");
    lista.add("laranja");
    System.out.println("Lista inicial: " + lista);
    busca(lista, "azul");
    Collections.sort(lista);
    System.out.println("Lista final: " + lista);
    busca(lista, "azul");
    busca(lista, "rosa");
    busca(lista, "laranja");
  }

  public static void busca(ArrayList<String> list, String alvo) {
    int index;
    System.out.println("Encontrando o index usando o próprio método da ArrayList: " + list.indexOf(alvo));
    if (list.contains(alvo)) {
      index = Collections.binarySearch(list, alvo);
      System.out.println("Alvo encontrado em " + index);
    } else {
      System.out.println("Alvo nao encontrado");
    }
  }
}
