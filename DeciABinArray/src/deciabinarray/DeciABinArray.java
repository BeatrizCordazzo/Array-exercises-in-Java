package deciabinarray;

import java.util.Scanner;


public class DeciABinArray {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un numero decimal: ");
        int num = sc.nextInt();
        String binary = convertToBinary(num); //llama al metodo convertToBinary y almacena el resultado en la variable binary
        System.out.println("El numero binario es: "+binary);
    }
    
    public static String convertToBinary(int num){ //metodo que convierte un numero decimal en un numero binario
        if (num == 0) { //si el numero es 0, devuelve "0"
            return "0";
        }
        String binary = ""; //inicializar una cadena vazia para almacenar el numero binario
        while(num > 0){
            int residuo = num % 2; //calcular el residuo de la division del numero por 2
            binary += residuo; //añade el residuo al principio de la cadena binaria
            num /= 2;
        }
        return binary; //devuelve el numero binario
    }
    
}
