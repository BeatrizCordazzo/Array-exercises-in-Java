package diamesano;

import java.util.Scanner;


public class DiaMesAno {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dia;
        int mes;
        int ano;
        String nombremes="";
        int diamaximo=0;

        System.out.println("Escriba el dia: ");
        dia=sc.nextInt();
        System.out.println("Escriba el mes: ");
        mes=sc.nextInt();
        System.out.println("Escriba el año: ");
        ano=sc.nextInt();
        
         if (mes==1||mes==3||mes==5||mes==7||mes==8||mes==10||mes==1||mes==12) {
            diamaximo=31;
        }else if (mes==4||mes==6||mes==9||mes==11) {
            diamaximo=30;
        }else if (mes==2) {
            if (ano%4==0) {
                diamaximo=29;
            }else{
                diamaximo=28;
            }
        }

        switch (mes) {
            case 1 -> nombremes="Enero";
            case 2 -> nombremes="Febrero";
            case 3 -> nombremes="Marzo";
            case 4 -> nombremes="Abril";
            case 5 -> nombremes="Mayo";
            case 6 -> nombremes="Junio";
            case 7 -> nombremes="Julio";
            case 8 -> nombremes="Agosto";
            case 9 -> nombremes="Septiembre";
            case 10 -> nombremes="Octubre";
            case 11 -> nombremes="Noviembre";
            case 12 -> nombremes="Diciembre";
        }
        if (ano <= 0 || mes < 1 || mes > 12 || dia < 1 || dia > diamaximo) {
            System.out.println("Error. La fecha ingresada no es válida.");
        } else{
            System.out.println("La fecha es: "+dia+" de "+nombremes+ " de "+ano);
        }

    }
    
}
