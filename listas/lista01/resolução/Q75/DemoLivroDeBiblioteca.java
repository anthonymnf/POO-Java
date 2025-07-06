package listas.lista01.resolução.Q75;

public class DemoLivroDeBiblioteca {
  public static void main(String[] args) {
    LivroDeBiblioteca livro = new LivroDeBiblioteca("POO", "Desconhecido", 100, 3, false, "Corredor 3");

    System.out.println("📖 Dados do livro:");
    System.out.println(livro);

    System.out.println("\n🔍 Descrição curta:");
    System.out.println(livro.descricao());

    System.out.println("\n📍 Localização:");
    System.out.println(livro.localizacao());

    System.out.println("\n📦 Emprestando o livro...");
    livro.empresta();
    System.out.println("Está emprestado? " + livro.estaEmprestado());

    System.out.println("\n📤 Devolvendo o livro...");
    livro.devolve();
    System.out.println("Está emprestado? " + livro.estaEmprestado());
  }
}
