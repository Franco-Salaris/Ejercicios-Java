
package e4;

import java.util.Scanner;

/*Dada una cantidad de grados centígrados se debe mostrar su equivalente en
grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
public class E4 {

   
    public static void main(String[] args) {
        
        Scanner leer= new Scanner(System.in);
        int num, num2;
        System.out.println("Ingrese los grados en centigrados: ");
        num = leer.nextInt();
        
        num2= 32 + (9 * num / 5);
        
        System.out.println("La tansformacion da como resultado: "+ num2+ " grados Fahrenheit");
        
    }
    
}
