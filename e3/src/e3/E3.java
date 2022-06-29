
package e3;

import java.util.Scanner;

/*Escribir un programa que pida una frase y la muestre toda en mayúsculas y
después toda en minúsculas. Nota: investigar la función toUpperCase() y
toLowerCase() en Java.
 */
public class E3 {

    
    public static void main(String[] args) {
      
        Scanner leer= new Scanner(System.in);
         String frase ;
            
         System.out.println("Ingrese la frase");
         frase= leer.next();
         System.out.print(frase.toUpperCase() );
         
      
    }

 
}
