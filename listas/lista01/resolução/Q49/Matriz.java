package listas.lista01.resolução.Q49;

public class Matriz {
  private float[][] matriz;

  public Matriz(float a11, float a12, float a21, float a22) {
    matriz = new float[2][2];
    matriz[0][0] = a11;
    matriz[0][1] = a12;
    matriz[1][0] = a21;
    matriz[1][1] = a22;
  }

  public float CalcularDeterminante() {
    return (matriz[0][0] * matriz[1][1]) - (matriz[0][1] * matriz[1][0]);
  }

  public void imprimirMatriz() {
    System.out.printf("%6.2f %6.2f\n", matriz[0][0], matriz[0][1]);
    System.out.printf("%6.2f %6.2f\n", matriz[1][0], matriz[1][1]);
  }

}
