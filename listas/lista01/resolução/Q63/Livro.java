package listas.lista01.resolução.Q63;

public class Livro {
  private String titulo, autor, genero, editora;
  private int anoDeLancamento;

  public Livro(String titulo, String autor, String genero, String editora, int anoDeLancamento) {
    this.titulo = titulo;
    this.autor = autor;
    this.genero = genero;
    this.editora = editora;
    this.anoDeLancamento = anoDeLancamento;
  }

  public String toString() {
    return "Dados do Livro\nTitulo: " + titulo + "\nAutor: " + autor + "\nGenero: " + genero + "\nEditora: " + editora
        + "\nAno de lançamento:" + anoDeLancamento;
  }
}
