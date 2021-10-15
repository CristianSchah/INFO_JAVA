import java.util.Scanner;
public class Nivel1_Ejercicio1 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        String nombre, apellido;

        try {

        System.out.println(" Ingrese su Nombre por favor");
        nombre = teclado.nextLine();
        System.out.println(" Ingrese su Apellido por favor ");
        apellido = teclado.nextLine();
        
        } finally {
            teclado.close();
        }
        System.out.println(" HOLA " + nombre + " " + apellido + "!");
    }
}