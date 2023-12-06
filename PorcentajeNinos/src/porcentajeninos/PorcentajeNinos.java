package porcentajeninos;

import java.util.Scanner;


public class PorcentajeNinos {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el numero de niños: ");
        int ninos = sc.nextInt();
        System.out.println("Introduzca el numero de niñas: ");
        int ninas = sc.nextInt();
        
        float porceninos = ninos * 100 / (ninos + ninas);
        float porceninas = 100 - porceninos;
        
        System.out.println("El porcentaje de niños es: "+porceninos);
        System.out.println("El porcentaje de ninas es: "+porceninas);
    }
    
}
