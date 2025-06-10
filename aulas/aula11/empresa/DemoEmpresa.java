package aulas.aula11.empresa;

public class DemoEmpresa {
  public static void main(String[] args) {
    Pessoa pessoa = new Pessoa("Augusto", "64464513384");
    Funcionario funcionario = new Funcionario("Leticia", "3121354646", 2000.00F);
    ChefeDeDepartamento chefeDeDepartamento = new ChefeDeDepartamento("Anthony", "46541236", 5300.50F, "TI");
    System.out.println(pessoa);
    System.out.println("\n" + funcionario);
    System.out.println("\n" + chefeDeDepartamento);
  }
}
