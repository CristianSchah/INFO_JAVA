import java.util.ArrayList;
import java.util.Scanner;
public class Nivel2_Ejercicio7 {

    public static void main(String[] args) {

        System.out.println("Ingrese por favor dos numero el primero tiene que ser mayor: ");
        
        Scanner teclado = new Scanner(System.in);
        int numero1 = teclado.nextInt();
        int numero2 = teclado.nextInt();
        
        teclado.close();
        ArrayList<String> lista = new ArrayList<String>();

        for (int i = numero1; i < numero2; i++) {
            if ((i % 2 == 0) && (i % 3 == 0)) {
                lista.add("FizzBuzz");
            } else if (i % 2 == 0) {
                lista.add("Fizz");
            } else if (i % 3 == 0) {
                lista.add("Buzz");
            } else {
            
                lista.add(String.valueOf(i));
            }
        }
        System.out.println(lista);
    }
}