import java.util.ArrayList;
import java.util.Scanner;
public class Nivel2_Ejercicio1 {
    public static void main(String[] args) {

        ArrayList<String> ciudades = new ArrayList<String>();
        
        Scanner teclado = new Scanner(System.in);
        
        int cuenta = 0;

        System.out.println("Para agregar una ciudad ingrese por favor su nombre");
        
        System.out.println("Para finalizar , escriba \"fin\"");

        String ciudad = teclado.nextLine();

        while (!ciudad.equals("fin")) {

            ciudades.add(ciudad);
            
            System.out.println("Para agregar una ciudad ingrese por favor su nombre");
            
            System.out.println("Para finalizar, escribe \"fin\"");
            
            ciudad = teclado.nextLine();
        }
        teclado.close();
        
        for (String i : ciudades){
            
            cuenta +=1;
            
            System.out.println("#" + cuenta +" "+ i);
        }
    }
}