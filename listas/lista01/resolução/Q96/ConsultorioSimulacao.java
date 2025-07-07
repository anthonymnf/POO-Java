package listas.lista01.resolução.Q96;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class ConsultorioSimulacao {
  public static void main(String[] args) {
    Queue<Paciente> filaPrioritaria = new LinkedList<>();
    Queue<Paciente> filaComum = new LinkedList<>();

    Random random = new Random();
    int tempoAtual = 0;
    int pacientesCriados = 0;
    int pacientesAtendidos = 0;

    final int TOTAL_PACIENTES = 20;
    final int INTERVALO_CHEGADA = 4; // minutos
    final int DURACAO_CONSULTA = 5; // minutos

    System.out.println("Simulação do atendimento do consultório médico:");
    System.out.println("--------------------------------------------------");

    while (pacientesAtendidos < TOTAL_PACIENTES) {

      // A cada 4 minutos, chega um novo paciente
      if (tempoAtual % INTERVALO_CHEGADA == 0 && pacientesCriados < TOTAL_PACIENTES) {
        int rg = 100000 + random.nextInt(900000); // 6 dígitos
        int idade = 1 + random.nextInt(99); // idade entre 1 e 99

        Paciente novo = new Paciente(rg, idade);
        pacientesCriados++;

        if (idade > 60) {
          filaPrioritaria.add(novo);
          System.out.println("Chegou (Prioritário): " + novo);
        } else {
          filaComum.add(novo);
          System.out.println("Chegou (Comum): " + novo);
        }
      }

      // Consulta a cada 5 minutos
      if (tempoAtual % DURACAO_CONSULTA == 0) {
        Paciente atendido = null;

        if (!filaPrioritaria.isEmpty()) {
          atendido = filaPrioritaria.poll();
        } else if (!filaComum.isEmpty()) {
          atendido = filaComum.poll();
        }

        if (atendido != null) {
          System.out.println("Atendido às " + tempoAtual + " min: " + atendido);
          pacientesAtendidos++;
        }
      }

      tempoAtual++;
    }

    System.out.println("--------------------------------------------------");
    System.out.println("Atendimento encerrado. Total de pacientes atendidos: " + pacientesAtendidos);
  }
}
