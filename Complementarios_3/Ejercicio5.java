import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ejercicio5 {

  public static void main(String[] args) {
    List<Alumno> alumnos =
        List.of(
            new Alumno("Cristian", "Estefano", LocalDate.of(1945, 02, 4)),
            new Alumno("Esequiel", "Shumager", LocalDate.of(1993, 5, 7)),
            new Alumno("David", "Inteligen", LocalDate.of(1979, 9, 5)));
            
    Map<String, Integer> edades = new HashMap<>();

    for (Alumno alumno : alumnos) {
      edades.put(
          alumno.getApellido() + " " + alumno.getNombre(),
          alumno.getNacimiento().until(LocalDate.now()).getYears());
    }

    System.out.println(edades);
  }
}
