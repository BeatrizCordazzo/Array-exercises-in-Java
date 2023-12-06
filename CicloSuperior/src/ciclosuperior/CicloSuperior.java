package ciclosuperior;

import java.util.Scanner;


public class CicloSuperior {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tienes el titulo de Bachiller? [S/N]");
        String bachiller = sc.nextLine().toLowerCase();
        
        if (bachiller.equals("s")) {
            System.out.println("Puedes acceder al grado superior!");
            return;
        }else {
            System.out.println("Tienes la prueba de acceso superada? [S/N]");
            String prueba = sc.nextLine().toLowerCase();
            
            if (prueba.equals("s")) {
                System.out.println("Puedes acceder al grado superior!");
            }else{
                System.out.println("No puedes acceder al grado superior!");
            }
        }
    }
    
}
