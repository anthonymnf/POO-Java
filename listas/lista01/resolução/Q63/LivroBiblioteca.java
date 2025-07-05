package listas.lista01.resolução.Q63;

public class LivroBiblioteca extends Livro {
  private int numeroExemplar;
  private boolean disponivelParaEmprestimo;

  public LivroBiblioteca(String titulo, String autor, String genero, String editora, int anoDeLancamento,
      int numeroExemplar, boolean disponivelParaEmprestimo) {
    super(titulo, autor, genero, editora, anoDeLancamento);
    this.numeroExemplar = numeroExemplar;
    this.disponivelParaEmprestimo = disponivelParaEmprestimo;
  }

  public String toString() {
    String isDisponivel = disponivelParaEmprestimo ? "Sim" : "Não";
    return super.toString() + "\nNúmero do exemplar: " + numeroExemplar + "\nDisponível para empréstimo? "
        + isDisponivel;
  }
}
