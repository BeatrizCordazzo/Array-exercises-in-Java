package binatodeciarray;

import java.util.Scanner;


public class BinaToDeciArray {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero binario: ");
        String binario = sc.nextLine();
        
        if (esBinario(binario)) {
            int decimal = binarioADecimal(binario);
            System.out.println("El numero decimal correspondiente es: "+decimal);
        }else{
            System.out.println("El numero introducido no es un numero binario!");
        }
        sc.close();
    } 
    public static boolean esBinario(String binario){
        for (char caracter : binario.toCharArray()) {
            if (caracter != '0' && caracter != '1') {
                return false;
            }
        }
        return true;
    }
        
    public static int binarioADecimal(String binario){
        return Integer.parseInt(binario, 2);
    }
}