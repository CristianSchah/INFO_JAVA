import java.util.Scanner;

public class Nivel1_Ejercicio8 {
        public static void main(String[] args) {
            
            Scanner teclado = new Scanner(System.in);
            
            try {
            
                System.out.println("Ingrese por favor su NOMBRE Y APELLIDO");
            
                String nombreYApellido = teclado.nextLine();
            
                System.out.println("Ingrese por favor su EDAD");
            
                String edad = teclado.nextLine();
            
                System.out.println("Ingrese por favor su DIRECCION ");
            
                String direccion= teclado.nextLine();
            
                System.out.println("Ingrese por favor su CIUDAD");
            
                String ciudad = teclado.nextLine();
    
            System.out.println(ciudad +" - "+ direccion +" - "+ edad +" - "+ nombreYApellido);
            
        } finally { teclado.close();}
    }
}
    