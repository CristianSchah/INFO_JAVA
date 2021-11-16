import java.util.ArrayList;
import java.util.List;
public class Ejercicio2 {

  public static void main(String[] args) {
    List<Integer> numeros = List.of(1, 2, 3, 4, 5, 6, 7, 8);
    List<Integer> potenciados = new ArrayList<>();
    for (Integer num : numeros) {
      potenciados.add(num * num);
    }
    System.out.println(potenciados);
  }
}
