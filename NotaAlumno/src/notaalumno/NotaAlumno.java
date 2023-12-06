package notaalumno;

import java.util.Scanner;


public class NotaAlumno {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String alumno;
        double notaPra, notaPro, notaTeo, notaFin;
        
        while (true) {            
            System.out.println("Introduce el nombre del alumno(deja en blanco para terminar): ");
            alumno = sc.nextLine();
            if (alumno.isEmpty()) { // si el nombre esta vacio, parar el programa
                break;
            }
            System.out.println("Introduce la nota de practicas: ");
            notaPra = sc.nextDouble();
            System.out.println("Introduce la nota de problemas: ");
            notaPro = sc.nextDouble();
            System.out.println("Introduce la nota de la parte teorica: ");
            notaTeo = sc.nextDouble();
            sc.nextLine(); //Para limpiar el buffer del scanner y volver a pedir otro nombre
            
            if ((notaPra < 0 || notaPra > 10) || (notaPro < 0 || notaPro > 10) || (notaTeo < 0 || notaTeo > 10)) {
                System.out.println("ERROR! Las notas deben estar entre 0 y 10");
            }else{
                notaFin = notaPra * 0.1 + notaPro * 0.5 + notaTeo * 0.4;
                System.out.println("La nota final de "+alumno+" es "+notaFin);
            }
        }
    }
    
}
