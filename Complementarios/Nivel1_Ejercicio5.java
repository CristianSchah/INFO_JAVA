import java.util.Scanner;

public class Nivel1_Ejercicio5 {
    public static void main(String[] args) {
            
        Scanner teclado = new Scanner(System.in);
        int suma = 0;

        
        try{

        System.out.println("Ingrese un valor por favor");
        int num1 = teclado.nextInt();
        System.out.println("Ingrese otro valor por favor");
        int num2 = teclado.nextInt();
 
        for (int i = 1; i <= num1; i++) {
            
            suma += num2;           
            if (i == num1) {
                System.out.println("El resultado de " + num1 + " x " + num2 + " = "+ suma);
            }
        }

    } finally { teclado.close(); }
}    
}
