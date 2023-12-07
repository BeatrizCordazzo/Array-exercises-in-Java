package alturamediaarray;

import java.util.Scanner;


public class AlturaMediaArray {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el numero de personas(numero entero y positivo): ");
        int num = sc.nextInt();
        
        double[] alturas = new double[num]; //Creamos un array para almacenar las alturas
        double suma = 0;
        
        for (int i = 0; i < num; i++) {
            System.out.println("Introduzca la altura de la "+(i+1)+" persona: ");
            alturas[i] = sc.nextDouble();
            suma += alturas[i]; //Sumamos la altura a la suma total
        }
        
        double media = suma / num; //Calculamos la altura media
        int superior = 0, inferior = 0; //Variables para quien es superior o inferior  a la media
        
        //Recorremos el array de altura para contar cuantas personas estan por encima o abajo de la media
        for (int i = 0; i < alturas.length; i++) {
            double altura = alturas[i];
            if (altura > media) {
                superior++;
            }else if (altura < media) {
                inferior++;
            }
        }
        System.out.println("Altura media: " + media);
        System.out.println("Personas con altura superior a la media: " + superior);
        System.out.println("Personas con altura inferior a la media: " + inferior);
    }
    
}
