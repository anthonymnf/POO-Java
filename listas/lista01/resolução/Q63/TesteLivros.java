package listas.lista01.resolução.Q63;

public class TesteLivros {
  public static void main(String[] args) {
    LivroLivraria livro1 = new LivroLivraria("Dom Casmurro", "Machado de Assis", "Romance", "Livraria Garnier", 1900,
        45F, 1000);
    LivroBiblioteca livro2 = new LivroBiblioteca("Memórias Póstumas de Brás Cubas", "Machado de Assis",
        "Literatura experimental, humor", "Tipografia Nacional", 1881, 13213516, false);
    System.out.println("Livro da Livraria:");
    System.out.println(livro1);

    System.out.println("\nLivro da Biblioteca:");
    System.out.println(livro2);
  }
}
