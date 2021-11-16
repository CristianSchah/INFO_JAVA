import java.util.ArrayList;
import java.util.List;

public class Ejercicio1 {

  public static void main(String[] args) {
    List<String> palabras = new ArrayList<>();
    palabras.add("HOLA");
    palabras.add("");
    palabras.add(null);
    palabras.add("INFORMATORIO");
    palabras.add("2021");
    palabras.add("3er Etapa");
    
    List<String> endPalabras = new ArrayList<>();
    for (String s : palabras) {
      if (s != null && !s.isEmpty()) {
        endPalabras.add(s);
      }
    }
    System.out.println(endPalabras);
  }
}
