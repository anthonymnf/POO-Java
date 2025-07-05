package listas.lista01.resolução.Q63;

public class LivroLivraria extends Livro {
  private float preco;
  private int estoque;

  public LivroLivraria(String titulo, String autor, String genero, String editora, int anoDeLancamento,
      float preco, int estoque) {
    super(titulo, autor, genero, editora, anoDeLancamento);
    this.preco = preco;
    this.estoque = estoque;
  }

  public String toString() {
    return super.toString() + "\nPreço: R$" + preco + "\nEstoque: " + estoque + " unidade(s)";
  }
}
