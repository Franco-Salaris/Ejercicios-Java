
package e12;

import java.util.Scanner;


public class E12 {

    /*Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10
la nota se pedirá de nuevo hasta que la nota sea correcta
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int nota;
        System.out.println("Bienvenido, ingresa tu nota: ");
       
       do{
           
           nota=leer.nextInt();
           
       }while(nota>1 && nota>10 );
       
      
       
       }
    }
    

