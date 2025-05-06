package aulas.aula05.faculdade;

public class RegistroAcademico {
  String nome, matricula;
  int codDoCurso;
  double percentualDeCobranca;

  void inicializaRegistroAcademicio(String n, String mat, int c, int p) {
    nome = n;
    matricula = mat;
    codDoCurso = c;
    percentualDeCobranca = p;
  }

  double calculaMensalidade() {
    return 100 * codDoCurso * (percentualDeCobranca / 100);
  }
}
