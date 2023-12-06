package hombremujervotar;

import java.util.Scanner;


public class HombreMujerVotar {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la edad: ");
        int edad = sc.nextInt();
        
        sc.nextLine();
        
        System.out.println("Introduzca el sexo [H/M]: ");
        String sexo = sc.nextLine().toLowerCase();
        
        if (sexo.equals("h")){
            if (edad >= 18)
                System.out.println("Eres hombre y puedes votar.");
            else
                System.out.println("Eres hombre y no puedes votar.");
        }else{
            if (edad >= 18) 
                System.out.println("Eres mujer y puedes votar.");
           else
                System.out.println("Eres mujer y no puedes votar.");
        }
    }
}  

    

