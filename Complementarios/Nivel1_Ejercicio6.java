import java.util.Scanner;
public class Nivel1_Ejercicio6 {
    public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);
        
        try {
        
            System.out.println("Ingrese el valor de la base por favor:");
            int base = teclado.nextInt();
            System.out.println("Ingresa el exponenete por favor:");
            int exponente = teclado.nextInt();
            System.out.println("El resultado de " + base + " elevado a " + exponente + " es: " + result(base, exponente));
    } 
    finally {teclado.close();}
}
    public static int result(int base, int exponent) {
        int resultado = 1;
        for (int i = 1; i <= exponent; i++) {
            resultado *= base;
        } return resultado;
    }
}
