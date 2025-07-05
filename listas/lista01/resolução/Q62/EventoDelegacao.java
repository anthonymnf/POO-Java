package listas.lista01.resolução.Q62;

public class EventoDelegacao {
  private String descricao;
  private DataHora dataHora;

  public EventoDelegacao(String descricao, int dia, int mes, int ano, int hora, int minuto) {
    this.descricao = descricao;
    this.dataHora = new DataHora(dia, mes, ano, hora, minuto);
  }

  @Override
  public String toString() {
    return "\nEvento: " + descricao + "\nData e hora: " + dataHora.getDataHora();
  }
}
