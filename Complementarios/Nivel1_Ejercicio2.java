import java.util.Scanner;

public class Nivel1_Ejercicio2 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int n1, n2, suma, resta, multiplicacion, división, modulo;
        try{

        System.out.println("Ingrese un numero por favor: ");
        n1 = teclado.nextInt();
        System.out.println("Ingrese un segundo numero,menor al anterior por favor: ");
        n2 = teclado.nextInt();
        suma = n1 + n2;
        resta = n1 - n2;
        multiplicacion = n1 * n2;
        división = n1 / n2;
        modulo = n1 % n2;
        } finally { teclado.close(); }

        System.out.println("Ambos nuemeros suman: " + suma);
        System.out.println("La difernecia de ambos es: " + resta);
        System.out.println("El producto de ambos es: " + multiplicacion);
        System.out.println("El cociente de ambos es: " + división);
        System.out.println("El módulo es: " + modulo);
    }
    
}
