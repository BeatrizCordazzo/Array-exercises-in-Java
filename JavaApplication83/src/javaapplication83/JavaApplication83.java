package javaapplication83;

import java.util.Scanner;


public class JavaApplication83 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[10];
        double suma = 0;
        int cont = 0;
        
        System.out.println("Introduzca 10 numeros: ");
        
        for (int i = 0; i < 10; i++) {
            num[i] = sc.nextInt();
            if (i % 2 == 0) {
                suma += num[i];
                cont++;
            }
        }
        double media = suma / cont;
        System.out.println("La media de los numeros pares es: "+media);
    }
    
}
