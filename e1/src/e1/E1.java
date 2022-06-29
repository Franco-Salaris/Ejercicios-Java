
package e1;

import java.util.Scanner;



public class E1 {

/*  Escribir un programa que pida dos números enteros por teclado y calcule la suma
de los dos. El programa deberá después mostrar el resultado de la suma */
    
    public static void main(String[] args) {
       
        
        Scanner leer= new Scanner(System.in);
        int num, num2;
        System.out.println("Ingrese el primer numero : ");
        num = leer.nextInt();
        
          System.out.println("Ingrese el segundo numero : ");
        num2 = leer.nextInt();
        System.out.println("La suma de los numeros es : ");
        System.out.println(num + num2 );
        
    }
    
}
