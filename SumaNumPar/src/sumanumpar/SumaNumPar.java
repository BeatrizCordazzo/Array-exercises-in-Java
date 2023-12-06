package sumanumpar;

import java.util.Scanner;


public class SumaNumPar {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un numero: ");
        int num = sc.nextInt();
        int suma = 0;
        
        for (int i = 1; i <= num; i++) {
                suma += i * 2;
        }
        System.out.println("La suma de los primeros "+num+" numeros pares es: "+suma);
    }
}
  
