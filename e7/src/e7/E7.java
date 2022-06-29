
package e7;

import java.util.Scanner;


public class E7 {

    /*
     * Crear un programa que dado un numero determine si es par o impar
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        int num;
        System.out.println("ingrese el numero");
        num= leer.nextInt();
        
        if (num %2==0){
            System.out.println("es par");
    }else {
            System.out.println("es impar");
        }
        
    }
    
}
