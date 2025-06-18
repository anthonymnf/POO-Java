package aulas.aula14;

public class Questionario {
  public static void main(String[] args) {
    int respostas[] = { 1, 2, 5, 0, 3, 5, 2, 1, 3, 14 };
    int frequencia[] = new int[6];
    int respInval = 0;

    for (int resp : respostas) {
      try {
        frequencia[resp]++;
      } catch (Exception e) {
        System.out.println(e);
        System.out.println("A alternativa " + resp + " nao eh possivel");
        respInval++;
      }
    }
    System.out.println("Resposta\tFrequencia");
    for (int i = 0; i < frequencia.length; i++) {
      System.out.println(i + "\t\t" + frequencia[i]);
    }
    System.out.println(respInval + " respostas invalidas");
  }
}
