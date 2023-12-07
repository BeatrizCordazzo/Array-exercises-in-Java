package notaalumnoarray;

import java.util.Scanner;


public class NotaAlumnoArray {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el numero de alumnos: ");
        int numAlumnos = sc.nextInt();
        double suma = 0;
        
        double[] notas = new double[numAlumnos];
        
        for (int i = 0; i < numAlumnos; i++) {
            System.out.print("Introduzca la nota del alumno "+(i+1)+" : ");
            notas[i] = sc.nextDouble();
        }
        
        for (int i = 0; i < numAlumnos; i++) {
            suma += notas[i];
        }
        double media = suma / numAlumnos;
        
        for (int i = 0; i < numAlumnos; i++) {
            if (notas[i] > media) {
                System.out.println("El estudiante "+(i+1)+" tiene una nota superior a la media: "+notas[i]);
            }
        }
        System.out.println("\nLa media del grupo es: "+media);
    }
    
}
