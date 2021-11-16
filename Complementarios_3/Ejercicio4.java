import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class Ejercicio4 {

  public static void main(String[] args) {
    List<Integer> numeros = List.of(1, 2,3,5,8,8,8,8,9,9,9,9);
    Set<Integer> numerosSinRepetir = new HashSet<>(numeros);
    List<Integer> factoriale = new ArrayList<>(); 
    for (Integer num : numerosSinRepetir) {
      factoriale.add(factorial(num));
    }
    System.out.println(factoriale);
  }
  private static int factorial(int n) {
    if (n <= 1) {
      return n;
    }
    return n * factorial(n - 1);
  }  
}
