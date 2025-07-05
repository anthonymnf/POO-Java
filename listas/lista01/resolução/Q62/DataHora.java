package listas.lista01.resolução.Q62;

public class DataHora {
  private int dia, ano, mes, hora, minuto;

  public DataHora(int dia, int mes, int ano, int hora, int minuto) {
    this.dia = dia;
    this.mes = mes;
    this.ano = ano;
    this.hora = hora;
    this.minuto = minuto;
  }

  public String getDataHora() {
    return String.format("%02d/%02d/%04d %02d:%02d", dia, mes, ano, hora, minuto);
  }
}
