package listas.lista01.resolução.Q48;

public class DemoAgenda {
  public static void main(String[] args) {
    Agenda minhaAgenda = new Agenda();
    EntradaEmAgenda comp1 = new EntradaEmAgenda(9, 15, 8, 2025, "Ir para à academia");
    EntradaEmAgenda comp2 = new EntradaEmAgenda(11, 15, 8, 2025, "Consulta médica");
    // Adiciona 2 compromissos
    minhaAgenda.addCompromisso(comp1);
    minhaAgenda.addCompromisso(comp2);

    // Data do aniversário (exemplo: 15 de agosto)
    int diaAniversario = 15;
    int mesAniversario = 8;
    int anoAniversario = 2025;

    System.out.println("Compromissos para a data do seu aniversário:");
    minhaAgenda.listaDia(diaAniversario, mesAniversario, anoAniversario);
  }
}
