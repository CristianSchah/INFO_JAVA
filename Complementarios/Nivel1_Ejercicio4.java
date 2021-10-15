import java.util.Scanner;
public class Nivel1_Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        try {
        System.out.println("Ingrese el numero que decee conocer  el factorial");
        int numero = teclado.nextInt();
        int factorial = 1;
        for (int i = 1; i<= numero; i++) {
            
            factorial = i * factorial;
            
            if (i == numero) {
                
                System.out.println(" El Factorial de " + numero + " es: "+ factorial);
            }
        }
    } finally { teclado.close();}
}
}

