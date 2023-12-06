package sumanumnaturales;

import java.util.Scanner;


public class SumaNumNaturales {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un numero: ");
        int num = sc.nextInt();
        int suma = 0;
        
        for (int i = 1; i <= num; i++) {
            suma += i;
        }
        System.out.println("La suma de los primeros "+num+" numeros naturales es: "+suma);
    }
    
}
