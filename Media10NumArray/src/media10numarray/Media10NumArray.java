package media10numarray;

import java.util.Scanner;

public class Media10NumArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[10]; //crear un array de enteros con capacidad para 10 numeros
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Introduce el "+(i+1)+"º numero: ");
            num[i] = sc.nextInt();
        }
        int sumaPos = 0, sumaNeg = 0, contPos = 0, contNeg = 0;
        
        for (int i = 0; i < 10; i++) {
            if (num[i] >= 0) {
                sumaPos += num[i];
                contPos++;
            }else{
                sumaNeg += num[i];
                contNeg++;
            }
        }       
        double mediaPos = (double) sumaPos / contPos;
        double mediaNeg = (double) sumaNeg / contNeg;
        
        System.out.println("La media de los numeros positivos es: "+mediaPos);
        System.out.println("La media de los numeros negativos es: "+mediaNeg);
    }
    
}
