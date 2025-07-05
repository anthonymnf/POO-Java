package listas.lista01.resolução.Q62;

public class EventoHeranca extends DataHora {
  private String descricao;

  public EventoHeranca(int dia, int mes, int ano, int hora, int minuto, String descricao) {
    super(dia, mes, ano, hora, minuto);
    this.descricao = descricao;
  }

  @Override
  public String toString() {
    return "\nEvento (Herança): " + descricao + "\nData e hora: " + super.getDataHora();
  }

}
