package negativoproductosuma;

import java.util.Scanner;


public class NegativoProductoSuma {

    
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca tres numeros positivo o negativo: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        
        if (num1 < 0) {
            double producto = num1 * num2 * num3;
            System.out.println("El producto de los tres numeros es: "+producto);
        } else{
            double suma = num1 + num2 + num3;
            System.out.println("La suma de los tres numeros es: "+suma);
        }
    }
}
