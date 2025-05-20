package aulas.aula07.Pessoa;

public class DemoPessoa {
  public static void main(String[] args) {
    Pessoa pessoa = new Pessoa("Matheus", 1.80);
    System.out.println(pessoa.getNome());
    System.out.println(pessoa.getAltura());
    System.out.println(pessoa.toString());
    System.out.println(pessoa);
  }
}
