import java.util.ArrayList;
import java.util.Collections;
public class Nivel2_Ejercicio3 {
    public static void main(String[] args) {

        ArrayList<String> baraja = new ArrayList<>();
        
        ArrayList<String> palo = new ArrayList<>();
                 
        String carta = "";

        palo.add("Treboles");
        
        palo.add("Diamantes");
        
        palo.add("Corazones");
        
        palo.add("Picas");

        for (String s : palo) {
            
            for (int i = 1; i < 14; i++){
                
                carta = i + " " + s;
                
                baraja.add(carta);
            }
        }
        System.out.println("Lista de cartas");
        
        System.out.println(baraja);

        System.out.println("Lista de cartas en orden invertido");
        
        Collections.reverse(baraja);
        
        System.out.println(baraja);

        System.out.println("Lista de cartas desordenadas");
        
        Collections.shuffle(baraja);
        
        System.out.println(baraja);

    }
}