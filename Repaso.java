
package com.mycompany.repaso;

import java.util.Scanner;

/**
 *
 * @author JIMMY
 */
public class Repaso {

    public static void main(String[] args) {
        var sc= new Scanner (System.in);
        
        System.out.println("Ingresa el valor a: ");
        int a = sc.nextInt();
        System.out.println("Ingresa el valor b: ");
        int b = sc.nextInt();
        System.out.println("Ingresa el valor c: ");
        int c = sc.nextInt();
        
        int suma=suma(a,b,c);
        int resta=resta(a,b,c);
        int multi=multi(a,b,c);
        
        System.out.println("La suma de "+a+" + "+b+" + "+c+" es igual a: "+suma);
        System.out.println("La resta de "+a+" - "+b+" - "+c+" es igual a: "+resta);
        System.out.println("La multiplicación de "+a+" * "+b+" * "+c+" es igual a: "+multi);
        
  
    }
    public static int suma(int a, int b, int c) {
       int suma= a+b+c;
       return suma;
    }
    public static int resta(int a, int b, int c) {
       int resta= a-b-c;
       return resta;
    }
    public static int multi(int a, int b, int c) {
       int multi= a*b*c;
       return multi;
    }  
}
