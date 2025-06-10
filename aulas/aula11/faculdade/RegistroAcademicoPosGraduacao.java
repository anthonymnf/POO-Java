package aulas.aula11.faculdade;

public class RegistroAcademicoPosGraduacao {
  private RegistroAcademico registro;
  private String tituloTese, orientador;

  public RegistroAcademicoPosGraduacao(RegistroAcademico registro, String tituloTese, String orientador) {
    this.registro = registro;
    this.tituloTese = tituloTese;
    this.orientador = orientador;
  }

  public RegistroAcademicoPosGraduacao(String nome, String matricula, String curso, String tituloTese,
      String orientador) {
    this.registro = new RegistroAcademico(nome, matricula, curso);
    this.tituloTese = tituloTese;
    this.orientador = orientador;
  }

  public String toString() {
    return registro + "\n" + "Titulo da Tese: " + tituloTese + "\n" + "Orientador: " + orientador;
  }
}
