import java.util.ArrayList;
import java.util.Scanner;
public class Nivel2_Ejercicio5 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        ArrayList<Integer> horasTrabajadas = new ArrayList<Integer>();
        
        ArrayList<Integer> valorHora = new ArrayList<Integer>();
        
        ArrayList<Integer> totalDia = new ArrayList<Integer>();
        
        int valor = 0;
        
        int sumaFinal = 0;
        
        int dias = 1;

        while (dias < 6){
            
            System.out.println("Ingrese por favor las horas trabajadas" + dias );
            valor = teclado.nextInt();
            horasTrabajadas.add(valor);

            System.out.println("Valor de la hora de trabajo"+ dias );
            valor = teclado.nextInt();            
            valorHora.add(valor);
            dias++;
        }
        teclado.close();
        for (int dia = 0; dia < valorHora.size(); dia++) {
            
            valor = valorHora.get(dia) * horasTrabajadas.get(dia);
            
            totalDia.add(valor);
        }

        for (int i :totalDia){
            
            sumaFinal += i;
        }

        System.out.println("Usted por el dia deberia cobrar:" + totalDia);
        System.out.println("Usted deberia cobrar en el mes  : " + sumaFinal);
    }
}