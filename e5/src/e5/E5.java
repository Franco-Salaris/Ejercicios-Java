
package e5;

import java.util.Scanner;


public class E5 {

    /*
     Escribir un programa que lea un número entero por teclado y muestre por pantalla
    el doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función
    Math.sqrt().

     */
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        int num, doble, triple;
        double raiz;
        System.out.println("Ingrese el numero: ");
        num=leer.nextInt();
        doble= num*2;
        triple=num*3;
        raiz=Math.sqrt(num);
        
        System.out.println("El numero ingresado es "+num +" y el doble es: "+ doble);
      System.out.println("El numero ingresado es "+num +" y el triple es: "+ triple);
       System.out.println("El numero ingresado es "+num +" y la raiz cuadrada es: "+ raiz);
        
        
        
        
        //int numero = (int) (Math.random() * 10);
    }
    
}
