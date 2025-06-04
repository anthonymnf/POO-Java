package listas.lista01.resolução.Q48;

import java.util.ArrayList;

public class Agenda {
  private ArrayList<EntradaEmAgenda> compromissos;

  public Agenda() {
    this.compromissos = new ArrayList<>();
  }

  public void addCompromisso(EntradaEmAgenda entrada) {
    this.compromissos.add(entrada);
  }

  public void listaDia(int dia, int mes, int ano) {
    boolean entrou = false;
    for (EntradaEmAgenda e : compromissos) {
      if (e.ehNoDia(dia, mes, ano)) {
        System.out.println(e);
        entrou = true;
      }
    }
    if (!entrou) {
      System.out.println("Nenhum compromisso encontrado para essa data!");
    }
  }
}
