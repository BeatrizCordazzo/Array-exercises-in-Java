package suma1a100;


public class Suma1a100 {

    
    public static void main(String[] args) {
        int suma = 0;
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
            suma += i;
        }
        System.out.println("La suma de todos los numeros de 1 a 100 es: "+suma);
    }
    
}
