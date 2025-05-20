package aulas.aula07.contabancaria;

public class ContaBancaria {
  private String nome;
  private boolean status;
  private double saldo;

  public ContaBancaria(String nome, boolean status, double saldo) {
    this.nome = nome;
    this.status = status;
    this.saldo = saldo;
  }

  public ContaBancaria(String nome) {
    this.nome = nome;
    this.status = false;
    this.saldo = 0;
  }

  @Override
  public String toString() {
    return "ContaBancaria [nome=" + nome + ", conta especial =" + (status ? "sim" : "não") + ", saldo=" + saldo + "]";
  }

}
