package listas.lista01.resolução.Q75;

public class Livro {
  private String titulo, autor;
  private int numeroDePaginas, anoDaEdicao;

  public Livro(String titulo, String autor, int numeroDePaginas, int anoDaEdicao) {
    this.titulo = titulo;
    this.autor = autor;
    this.numeroDePaginas = numeroDePaginas;
    this.anoDaEdicao = anoDaEdicao;
  }

  public String qualTitulo() {
    return titulo;
  }

  public String qualAutor() {
    return autor;
  }

  public String toString() {
    return "\nTítulo: " + titulo + "\nAutor: " + autor + "\nNúmero de páginas: " + numeroDePaginas + "\nAno da edição: "
        + anoDaEdicao;
  }

}
