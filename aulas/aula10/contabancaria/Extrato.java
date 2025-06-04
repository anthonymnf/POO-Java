package aulas.aula10.contabancaria;

import java.util.ArrayList;

public class Extrato {
  private float saldoFinal;
  private ArrayList<Float> transacoes;

  public Extrato() {
    saldoFinal = 0;
    transacoes = new ArrayList<>();
  }

  public void transacao(float valor) {
    if (saldoFinal + valor >= 0.0) {
      saldoFinal += valor;
      transacoes.add(valor);
    }
  }

  public String toString() {
    String res = "----------------------\n";
    for (Float f : transacoes) {
      res += f + "\n";
    }
    res += "Saldo: " + saldoFinal + "\n";
    res += "----------------------\n";
    return res;
  }
}
