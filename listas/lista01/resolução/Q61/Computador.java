package listas.lista01.resolução.Q61;

public class Computador extends Equipamento {
  private String processador, memoriaInterna, memoriaRAM;

  public Computador(String nome, float preco, String processador, String memoriaInterna, String memoriaRAM) {
    super(nome, preco);
    this.processador = processador;
    this.memoriaInterna = memoriaInterna;
    this.memoriaRAM = memoriaRAM;
  }

  public String getProcessador() {
    return processador;
  }

  public void setProcessador(String processador) {
    this.processador = processador;
  }

  public String getMemoriaInterna() {
    return memoriaInterna;
  }

  public void setMemoriaInterna(String memoriaInterna) {
    this.memoriaInterna = memoriaInterna;
  }

  public String getMemoriaRAM() {
    return memoriaRAM;
  }

  public void setMemoriaRAM(String memoriaRAM) {
    this.memoriaRAM = memoriaRAM;
  }

  @Override
  public String toString() {
    return super.toString() + "\n-Processador=" + processador + "\n-MemoriaInterna=" + memoriaInterna + "\n-MemoriaRAM="
        + memoriaRAM;
  }

}
