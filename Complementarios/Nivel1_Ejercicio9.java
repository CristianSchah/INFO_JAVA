import java.util.Scanner;
public class Nivel1_Ejercicio9 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        try {
        System.out.println("Por favor escriba el texto: ");
        String frase = teclado.nextLine();
        System.out.println("Letra de interés en el texto");
        char letra = teclado.next().charAt(0);
        int contador = 0;

        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == letra) {       
                contador++;
            }
        }
        System.out.println(contador);
        
    } finally {teclado.close();}
}
}