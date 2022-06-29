
package e8;

import java.util.Scanner;


public class E8 {

    /*Crear un programa que pida unrase y si esa fra fase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota:
investigar la función equals() en Java.
     */
    public static void main(String[] args) {
        
        Scanner leer= new Scanner(System.in);
        String cad, cad2;
        System.out.println("ingrese su frase");
        cad=leer.next();
        
        
        if(cad.equals("eureka")){
            System.out.println("correcto");
        }else {
            System.out.println("incorrecto");
        }
        
            
            
        
            
        
        
    }
    
}
