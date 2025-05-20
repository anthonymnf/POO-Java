package aulas.aula07.contabancaria;

public class DemoContaBancaria {
  public static void main(String[] args) {
    ContaBancaria conta1 = new ContaBancaria("Anthony", true, 100);
    ContaBancaria conta2 = new ContaBancaria("Matheus");
    System.out.println(conta1);
    System.out.println(conta2);
  }
}
