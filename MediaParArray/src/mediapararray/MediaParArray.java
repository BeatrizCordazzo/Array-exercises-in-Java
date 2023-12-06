package mediapararray;

import java.util.Scanner;


public class MediaParArray {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[10];
        int suma = 0;
        int cont = 0;
        
        System.out.println("Introduzca 10 numeros enteros: ");
        
        for (int i = 0; i < 10; i++) {
            num[i] = sc.nextInt();
            if (i % 2 == 0) {
                suma += num[i];
                cont++;
            }
        }
        
        double media = (double) suma / cont;
        
        System.out.println("La media de los numeros pares es: "+media);
    }
    
}