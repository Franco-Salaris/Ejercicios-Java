
package e10;

import java.util.Scanner;


public class E10 {

    /*. Escriba un programa que pida una frase o palabra y valide si la primera letra de esa
frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por
pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir
“INCORRECTO”. Nota: investigar la función Substring y equals() de Java
     */
    public static void main(String[] args) {
        
       Scanner leer=new Scanner(System.in);
       String cad, sub,sub2;
        System.out.println("ingrese su cadena, con la primera letra siendo una A");
        cad=leer.next();
        sub= cad.substring(0,1);
        sub2= sub.toLowerCase();
        
        System.out.println(sub);
    
        if("a".equals(sub2) ){
            System.out.println("correecto");
        }else{
                System.out.println("incorrecto");
                }
        
       /* String sCadena = "Hola Mundo";
    String sSubCadena = sCadena.substring(5,10);
    System.out.println(sSubCadena);  */
        
    }
    
}
