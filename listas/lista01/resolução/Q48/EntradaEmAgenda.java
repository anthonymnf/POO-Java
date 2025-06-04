package listas.lista01.resolução.Q48;

public class EntradaEmAgenda {
  private int hora, dia, mes, ano;
  private String assunto;

  public EntradaEmAgenda(int hora, int dia, int mes, int ano, String assunto) {
    if (hora < 0 || hora > 23) {
      throw new IllegalArgumentException("Hora inválida. Deve estar entre 0 e 23.");
    }
    if (mes < 1 || mes > 12) {
      throw new IllegalArgumentException("Mês inválido. Deve estar entre 1 e 12.");
    }
    if (dia < 1 || dia > 31) { // Limite genérico, abaixo ajustamos por mês
      throw new IllegalArgumentException("Dia inválido. Deve estar entre 1 e 31.");
    }
    if (ano < 0) {
      throw new IllegalArgumentException("Ano inválido. Deve ser positivo.");
    }
    if (assunto == null || assunto.trim().isEmpty()) {
      throw new IllegalArgumentException("Assunto não pode ser nulo ou vazio.");
    }

    // Verificação de dias válidos para cada mês (sem considerar anos bissextos
    // ainda)
    int[] diasPorMes = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
    // Ajusta fevereiro para ano bissexto
    if (mes == 2 && ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0))) {
      diasPorMes[1] = 29;
    }
    if (dia > diasPorMes[mes - 1]) {
      throw new IllegalArgumentException("Dia inválido para o mês informado.");
    }

    this.hora = hora;
    this.dia = dia;
    this.mes = mes;
    this.ano = ano;
    this.assunto = assunto.trim();

  }

  @Override
  public String toString() {
    return String.format("Data: %02d/%02d/%04d %02dh - Assunto: %s", dia, mes, ano, hora, assunto);
  }

  public boolean ehNoDia(int dia, int mes, int ano) {
    return this.dia == dia && this.mes == mes && this.ano == ano;
  }

}
