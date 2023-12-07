package sueldoarray;

import java.util.Scanner;


public class SueldoArray {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nombres = new String[20];
        double[] sueldo = new double[20];
        
        for (int i = 0; i < 20; i++) {
            System.out.print("Introduzca el nombre del "+(i+1)+" empleado: ");
            nombres[i] = sc.nextLine();
            System.out.print("Introduzca el sueldo del "+(i+1)+" empleado: ");
            sueldo[i] = sc.nextDouble();
            sc.nextLine();
        }
        double mayorSueldo = sueldo[0];
        String mayorEmpleado = nombres[0];
        
        for (int i = 1; i < 20; i++) {
            if (sueldo[i] > mayorSueldo) {
                mayorSueldo = sueldo[i];
                mayorEmpleado = nombres[i];
            }
        }
        System.out.println("El empleado con el sueldo más alto es "+mayorEmpleado+" con un sueldo de " + mayorSueldo);
    }
    
}