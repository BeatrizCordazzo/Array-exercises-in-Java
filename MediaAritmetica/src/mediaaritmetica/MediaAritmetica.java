package mediaaritmetica;

import java.util.Scanner;


public class MediaAritmetica {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double media, num, numnumeros, suma;
        numnumeros = 0;
        suma = 0;
        media = 0;
        System.out.println("Introduzca una secuencia de numeros que termine con -1: ");
        num = sc.nextDouble();
        
        while(num != -1){
            suma += num;
            System.out.println("Introduzca -1 para terminar: ");
            num = sc.nextDouble();
            numnumeros += 1;
        }
        media = suma / numnumeros;
        System.out.println("La media aritmetica es: "+media);
    }
}

