package aulas.aula11.faculdade;

public class DemoUniversidade {
  public static void main(String[] args) {
    RegistroAcademico graduando = new RegistroAcademico("Anthony", "13513233135", "Engenharia de Computação");
    RegistroAcademicoPosGraduacao posGraduando1 = new RegistroAcademicoPosGraduacao(graduando, "IA nas escolas",
        "Segundo");
    RegistroAcademicoPosGraduacao posGraduando2 = new RegistroAcademicoPosGraduacao("Johnny", "13511581",
        "Educação física", "A importância da educação física nas escolas", "Eden");
    System.out.println(posGraduando1);
    System.out.println(posGraduando2);
  }

}
