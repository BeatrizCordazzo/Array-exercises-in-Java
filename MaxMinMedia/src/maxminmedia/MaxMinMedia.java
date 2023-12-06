package maxminmedia;

import java.util.Scanner;

public class MaxMinMedia {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, max = Integer.MIN_VALUE, min = Integer.MAX_VALUE, suma = 0, cont = 0;
        
        while (true) {            
            System.out.println("Introduce un numero entero, 0 para terminar: ");
            num = sc.nextInt();
            
            if (num == 0) {
                break;
            }
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
            suma += num;
            cont++;
        }
        if (cont > 0) {
            double media = (double) suma / cont;
            System.out.println("El maximo es: "+max);
            System.out.println("El minimo es: "+min);
            System.out.println("La media es: "+media);
        }else{
            System.out.println("NO se introdujo ningun numero.");
        }
    }
}