package aulas.aula06.eventoacademico;

public class EventoAcademico {
  String nomeDoEvento, localDoEvento;
  int numeroDeParticipantes;

  EventoAcademico(String n, String l, int p) {
    nomeDoEvento = n;
    localDoEvento = (l.isEmpty()? "UFERSA":l);
    numeroDeParticipantes = (p > 0 ? p  : 1);
  }

  void mostraEvento() {
    System.out.println("Nome: " + nomeDoEvento);
    System.out.println("Local: " + localDoEvento);
    System.out.println("Numero de participantes: " + numeroDeParticipantes);
  }
}
