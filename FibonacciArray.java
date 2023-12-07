package fibonacciarray;

import java.util.Scanner;


public class FibonacciArray {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Introduzca la cantidad de numeros que quieres: ");
        int n = sc.nextInt();
        System.out.println("Los "+n+" primeros numeros de la serie Fibonacci son: ");
        
        for (int i = 0; i < n; i++) {
            System.out.println(fibonacci(i)+" ");
        }
        sc.close();
    }
    
    public static int fibonacci(int n){
        if (n <= 1) {
            return n;
        }else{
            return fibonacci(n-1)+ fibonacci(n-2);
        }
    }   
}