package listas.lista01.resolução.Q65;

public class Tecnico extends Assistente {
  private float bonusSalarial;

  public Tecnico(String nome, float salario, int numMatricula, float bonusSalarial) {
    super(nome, salario, numMatricula);
    this.bonusSalarial = bonusSalarial;
  }

  public float ganhoAnual() {
    return (super.getSalario() + bonusSalarial) * 13;
  }

  public String toString() {
    return super.toString() + "\nBônus salarial: R$" + bonusSalarial;
  }
}
