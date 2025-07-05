package listas.lista01.resolução.Q62;

// Herança -> EventoHeranca extends DataHora -> "É um" (EventoHeranca é uma DataHora)

// Delegação -> EventoDelegacao tem um campo DataHora -> "Tem um" (EventoDelegacao tem uma DataHora)

public class TesteEventos {
  public static void main(String[] args) {
    EventoDelegacao reuniao = new EventoDelegacao("Reunião com a equipe", 1, 7, 2025, 14, 30);
    EventoHeranca apresentacao = new EventoHeranca(1, 7, 2025, 15, 45, "Apresentação do projeto");

    System.out.println(reuniao); // usa delegação
    System.out.println(apresentacao); // usa herança
  }
}
