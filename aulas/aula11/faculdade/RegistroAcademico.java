package aulas.aula11.faculdade;

public class RegistroAcademico {
  private String nome, matricula, curso;

  public RegistroAcademico(String nome, String matricula, String curso) {
    this.nome = nome;
    this.matricula = matricula;
    this.curso = curso;
  }

  public String toString() {
    return "Nome: " + nome + "\n" + "Matricula: " + matricula + "\n" + "Curso: " + curso;
  }
}
