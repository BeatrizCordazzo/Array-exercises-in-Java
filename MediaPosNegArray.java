package mediaposnegarray;

import java.util.Scanner;


public class MediaPosNegArray {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[10];
        System.out.print("Introduzca un numero entero, positivo o negativo: ");
        
        
        for (int i = 0; i < 10; i++) {
            num[i] = sc.nextInt();
        }
        double sumaPos = 0;
        double sumaNeg = 0;
        int cantPos = 0;
        int cantNeg = 0;
        
        for (int i = 0; i < 10; i++) {
            if (num[i] >= 0) {
                sumaPos += num[i];
                cantPos++;
            }else{
                sumaNeg += num[i];
                cantNeg++;
            }
        }
        double mediaPos = sumaPos / cantPos;
        double mediaNeg = sumaNeg / cantNeg;
        
        System.out.println("La media de los valores positivos es: "+mediaPos);
        System.out.println("La media de los valores negativos es: "+mediaNeg);
    }
    
}
