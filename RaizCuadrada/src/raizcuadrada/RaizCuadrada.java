package raizcuadrada;

import java.util.Scanner;


public class RaizCuadrada {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un numero: ");
        double num = sc.nextDouble();
        
        if (num <= 0) {
            System.out.println("ERROR! Introduzca un numero mayor que 0");
        }
        if (num > 0) {
            double cuadrado = num * num;
            double raiz = Math.sqrt(num);
            System.out.println("El cuadrado del numero "+num+" es: "+cuadrado+", y la raiz cuadrada es: "+raiz);
        }
    }
    
}
