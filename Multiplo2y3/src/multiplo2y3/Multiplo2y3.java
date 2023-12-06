package multiplo2y3;


public class Multiplo2y3 {

    
    public static void main(String[] args) {
        double c, i;
        c = 0;
        i = 1;
        while(i <= 100){
            if (i % 2 == 0 || i % 3 == 0) {
                c += 1;
                System.out.println("El numero "+i+" es multiplo de 2 o de 3.");
            }else{
                System.out.println("El numero "+i+" no es multiplo de 2 o de 3.");
            }
            i += 1;
        }
        System.out.println("El numero de multiples es de: "+c);
    }
    
}
