package aulas.aula08.classegenerica;

public class DemoTupla {
  public static void main(String[] args) {
    Tupla<String, Double> t1 = new Tupla<String, Double>("UFERSA", 1333.2);
    System.out.println(t1);
    Tupla<Character, Integer> t2 = new Tupla<Character, Integer>('A', 1);
    System.out.println(t2);
  }
}
