
package e6;

import java.util.Scanner;


public class E6 {

    /*
    Implementar un programa que dado dos números enteros determine cuál es el
mayor y lo muestre por pantalla.
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        int num, num2,num3;
        System.out.println("ingrese el primer numero");
        num= leer.nextInt();
        System.out.println("ingrese el segundo numero");
        num2=leer.nextInt();
        
     if (num > num2){
         System.out.println("el numero "+num +" es el mayor");
     }else {
         System.out.println("el numero "+num2 +" es el mayor");
     }
        
        
    }
    
}
