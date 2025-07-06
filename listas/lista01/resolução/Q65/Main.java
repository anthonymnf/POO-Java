package listas.lista01.resolução.Q65;

public class Main {
  public static void main(String[] args) {
    // Funcionário comum
    Funcionario f = new Funcionario("João", 2500f);
    f.aumentarSalario(500f); // aumento de R$500
    System.out.println(f);
    System.out.printf("Ganho anual: R$%.2f\n", f.ganhoAnual());

    System.out.println("\n----------------------\n");

    // Assistente
    Assistente a = new Assistente("Maria", 2800f, 1234);
    System.out.println(a);
    System.out.printf("Ganho anual: R$%.2f\n", a.ganhoAnual());

    System.out.println("\n----------------------\n");

    // Técnico com bônus salarial
    Tecnico t = new Tecnico("Carlos", 3000f, 5678, 400f); // bônus de R$400
    System.out.println(t);
    System.out.printf("Ganho anual: R$%.2f\n", t.ganhoAnual());

    System.out.println("\n----------------------\n");

    // Administrativo noturno com adicional
    Administrativo ad = new Administrativo("Ana", 2900f, 9012, "noite", 500f);
    System.out.println(ad);
    System.out.printf("Ganho anual: R$%.2f\n", ad.ganhoAnual());
  }
}
