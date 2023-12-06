package contfrases;

import java.util.Scanner;


public class ContFrases {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase;
        int cont = 0;
        System.out.println("Introduce una frase, o pulse n para acabar: ");
        frase = sc.nextLine();
        
        while(!frase.equalsIgnoreCase("n")){
            cont++;
            System.out.println("Introduce mas frases, o pulse n para acabar: ");
            frase = sc.nextLine();
        }
        System.out.println("El numero de frases es: "+cont);
    }
    
}
