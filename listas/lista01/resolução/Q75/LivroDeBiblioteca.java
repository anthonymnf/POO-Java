package listas.lista01.resolução.Q75;

public class LivroDeBiblioteca extends Livro implements ItemDeBiblioteca {
  private boolean emprestado;
  private String local;

  public LivroDeBiblioteca(String titulo, String autor, int numeroDePaginas, int anoDaEdicao, boolean emprestado,
      String local) {
    super(titulo, autor, numeroDePaginas, anoDaEdicao);
    this.emprestado = emprestado;
    this.local = local;
  }

  public String toString() {
    String isEmprestado = emprestado ? "Sim" : "Não";
    return super.toString() + "\nDisponível para empréstimo: " + isEmprestado + "\nLocal: " + local;
  }

  public boolean estaEmprestado() {
    return emprestado;
  }

  public void empresta() {
    emprestado = true;
  }

  public void devolve() {
    emprestado = false;
  }

  public String localizacao() {
    return local;
  }

  public String descricao() {
    return "Livro: " + qualTitulo() + " - " + qualAutor();
  }

}
