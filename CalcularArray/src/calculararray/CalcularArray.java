package calculararray;

import java.util.Scanner;


public class CalcularArray {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[10];
        
        System.out.println("Introduzca 10 numeros: ");
        
        double contPos = 0, contNeg = 0, contCero = 0;
        
        for (int i = 0; i < 10; i++) {
            num[i] = sc.nextInt();
            if (num[i] > 0) {
                contPos ++;
            }else if (num[i] < 0) {
                contNeg ++;
            }else{
                contCero ++;
            }
        }
        System.out.println("La cantidad de numeros positivos es: "+contPos);
        System.out.println("La cantidad de numeros negativos es: "+contNeg);
        System.out.println("La cantidad de numeros ceros es: "+contCero);
    }
    
}
