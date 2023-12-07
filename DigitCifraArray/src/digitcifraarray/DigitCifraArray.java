package digitcifraarray;

import java.util.Scanner;


public class DigitCifraArray {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] array = new String[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Introduce el carácter " + (i + 1) + ":");
            array[i] = sc.next();
        }

        for (String s : array) {
            if (s.length() == 1 && Character.isDigit(s.charAt(0))) {
                System.out.println(s + " es un dígito numérico.");
            } else {
                System.out.println(s + " es una cifra.");
            }
        }

        System.out.println("El array introducido es:");
        for (String s : array) {
            System.out.print(s + " ");
        }
    }   
}
