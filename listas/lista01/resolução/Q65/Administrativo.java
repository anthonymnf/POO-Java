package listas.lista01.resolução.Q65;

public class Administrativo extends Assistente {
  private String turno;
  private float adicionalNoturno;

  public Administrativo(String nome, float salario, int numMatricula, String turno, float adicionalNoturno) {
    super(nome, salario, numMatricula);
    this.turno = turno;
    this.adicionalNoturno = adicionalNoturno;
  }

  public float ganhoAnual() {
    return (super.getSalario() + adicionalNoturno) * 12 + super.getSalario();
  }

  public String toString() {
    return super.toString() + "\nTurno: " + turno + "\nAdicional noturno: R$" + adicionalNoturno;
  }
}
