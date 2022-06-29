
package e9;

import java.util.Scanner;


public class E9 {

    /*Realizar un programa que solo permita introducir solo frases o palabras de 8 de
largo. Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir
un mensaje por pantalla que diga “CORRECTi el usuario ingresa una fraO”, en caso contrario, se deberá
imprimir “INCORRECTO”. Nota: investigar la función Lenght() en Java.
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        String frase;
        int cad;
          System.out.println("ingrese una frase o palabra de 8 letras: ");
            frase=leer.next();
                
          cad= frase.length();
          if (cad==8){
              System.out.println("correcto");
          }else{
              System.out.println("incorrecto");
          }
            
      
        
        
    }
    
}
