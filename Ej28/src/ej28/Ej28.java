package ej28;

import java.util.Scanner;


public class Ej28 {

    
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer número: ");
        int num1 = sc.nextInt();
        System.out.println("Introduce el segundo número: ");
        int num2 = sc.nextInt();

        int inicio = Math.min(num1, num2);
        int fin = Math.max(num1, num2);

        int contadorTotal = 0;
        int contadorPares = 0;
        int sumaImpares = 0;

        for (int i = inicio; i <= fin; i++) {
            System.out.println(i);
            contadorTotal++;

            if (i % 2 == 0) {
                contadorPares++;
            } else {
                sumaImpares += i;
            }
        }

        System.out.println("Hay " + contadorTotal + " números entre " + inicio + " y " + fin);
        System.out.println("De ellos, " + contadorPares + " son pares");
        System.out.println("La suma de los números impares es " + sumaImpares);
    }
}