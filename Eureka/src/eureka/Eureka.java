package eureka;

import java.util.Scanner;


public class Eureka {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cont = 3;
        boolean acierto = false;
        String claveCorrecta = "eureka";
        
        while(cont > 0 && !acierto){
            System.out.println("Introduzca la clave: ");
            String clave = sc.nextLine();
            
            if (clave.equals(claveCorrecta)) {
                System.out.println("La clave es correcta!");
                acierto = true;
            }else{
                cont--;
                if (cont > 0) {
                    System.out.println("Clave incorrecta. Intenta otra vez: ");
                }else{
                    System.out.println("Has agotado los intentos!");
                }
            }            
        }
    }
    
}
