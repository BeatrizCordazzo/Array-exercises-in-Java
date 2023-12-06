package paroimpar;

import java.util.Scanner;


public class ParOImpar {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduza un numero entero: ");
        float num = sc.nextFloat();
        
        if (num == 0 ) {
            System.out.println("El numero no es par ni impar!");
        }else if(num % 2 == 0) {
            System.out.println("El numero es par!");
        } else {
            System.out.println("El numero es impar!");
        }
    }
    
}
