import java.util.Scanner;
public class Nivel1_Ejercicio7 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        try {

        System.out.println("Ingrese la palabra en minuscula");
        
        String frase = teclado.nextLine();

        char letras[] = frase.toCharArray();

        for (int i = 0; i < letras.length; i++) {
            if (letras[i] >= 'a' && letras[i] <= 'z' ) { 
                System.out.print((char) (letras[i]-32));
            } 
            else {
                System.out.print((char) (letras[i]));
            }
        }
    } finally { teclado.close(); }
}
}
