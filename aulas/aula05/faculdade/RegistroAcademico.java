package aulas.aula05.faculdade;

public class RegistroAcademico {
  private String nome, matricula;
  private int codDoCurso;
  private double percentualDeCobranca;

  public void inicializaRegistroAcademicio(String n, String mat, int c, int p) {
    nome = n;
    matricula = mat;
    codDoCurso = c;
    percentualDeCobranca = p;
  }

  public double calculaMensalidade() {
    return 100 * codDoCurso * (percentualDeCobranca / 100);
  }
}
