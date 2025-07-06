package listas.lista01.resolução.Q72;

public class Funcionario {
  private String nome, cargo, turno;
  private int cargaHorariaSemanal;
  private float salarioPorHora;

  public Funcionario(String nome) {
    this.nome = nome;
    this.cargaHorariaSemanal = 44;
    this.turno = "Diurno";
    this.cargo = "Peão";
    this.salarioPorHora = 2F;
  }

  public Funcionario(String nome, float salarioPorHora) {
    this.nome = nome;
    this.cargaHorariaSemanal = 44;
    this.turno = "Diurno";
    this.cargo = "Peão";
    this.salarioPorHora = salarioPorHora;
  }

  public void mudancaDeCargo(String novoCargo) {
    cargo = novoCargo;
  }

  public void aumentarSalarioPorHora(float aumento) {
    salarioPorHora += aumento;
  }

  public float salarioMensal() {
    return (salarioPorHora * cargaHorariaSemanal) * 4;
  }

  public String toString() {
    return "Dados\n- Nome: " + nome + "\n- Cargo: " + cargo + "\n- Turno: " + turno + "\n - Carga horária semanal: "
        + cargaHorariaSemanal + "\n- Salário por hora: " + salarioPorHora + "\n- Salário mensal: " + salarioMensal();
  }
}
