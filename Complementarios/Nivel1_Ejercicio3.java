import java.util.Scanner;
public class Nivel1_Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        try {

        System.out.println("Ingresa un Numero por favor");
        int numero = teclado.nextInt();
        for (int i = 1; i <= numero; i++) {
            
            System.out.println();
            
            for (int x = 1; x <= i; x++) {
                System.out.println(x);
            }
        }
    } finally { teclado.close();}
}
}

