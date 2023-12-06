package paroimpar2;

import java.util.Scanner;


public class ParOImpar2 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        System.out.print("Introduza un numero entero: ");
        num = sc.nextInt();
        
        do {
            if (num == 0) {
                System.out.print("Introduzca un numero mayor que 0: ");
                num = sc.nextInt();
            }
        } while (num == 0);
        if(num % 2 == 0) {
            System.out.println("El numero es par!");
            } else {
            System.out.println("El numero es impar!");
            }   
    }
}
    

