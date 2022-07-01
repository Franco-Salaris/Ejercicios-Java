package javaapplication16;

import java.util.Scanner;


public class JavaApplication16 {

    /*Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe
salir del bucle y mostrar el mensaje "Se capturó el numero cero". El programa
deberá calcular y mostrar el resultado de la suma de los números leídos, pero si el
número es negativo no debe sumarse. */
   
    public static void main(String[] args) {
        
         Scanner leer = new Scanner(System.in);
        int n1=0,n2, contador;
       contador=1;
        
        do{
           
        System.out.print("ingrese el numero: ");
        n2= leer.nextInt();
        if(n2>0 ){
            n1=n1+n2;
            contador=contador+1;
        }
            
        }
        
        while(n2!=0 && contador<20);
        System.out.println("Se capturó el numero cero");
        System.out.println("la suma de los numeros ingresados es: "+n1);
        if (n2>-1 && n2<1 ){
            
        }
        
        
        
        
        
        
        
    }
    
}
