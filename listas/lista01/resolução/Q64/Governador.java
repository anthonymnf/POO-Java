package listas.lista01.resolução.Q64;

public class Governador extends Politico {
  private String estado;

  public Governador(String nome, int idade, String partido, String estado) {
    super(nome, idade, partido);
    this.estado = estado;
  }

  public String toString() {
    return super.toString() + "\nEstado governado: " + estado;
  }
}
