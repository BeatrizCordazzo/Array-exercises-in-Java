package javaapplication84;

import java.util.Scanner;


public class JavaApplication84 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el numero de alumnos: ");
        int numAlumnos = sc.nextInt();
        double suma = 0;
        
        double[] nota = new double[numAlumnos];
        
        for (int i = 0; i < numAlumnos; i++) {
            System.out.print("Introduzca la nota del alumno: ");
            nota[i] = sc.nextDouble();
        }
        
        for (int i = 0; i < numAlumnos; i++) {
            suma += nota[i];
        }
        
        double media = suma / numAlumnos;
        
        for (int i = 0; i < numAlumnos; i++) {
            if (nota[i] > media) {
                System.out.println("El alumno "+(i+1)+" tiene la nota mayor que la media: "+nota[i]);
            }
        }
        System.out.println("La media del grupo es: "+media);
    }
    
}
