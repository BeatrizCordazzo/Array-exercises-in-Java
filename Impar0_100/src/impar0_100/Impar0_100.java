package impar0_100;


public class Impar0_100 {

    
    public static void main(String[] args) {
        System.out.println("Los numeros impares entre 0 y 100:");
        int num = 1;
        while(num<=100){
            if (num % 2 !=0) {
                System.out.println(num);
            }
            num += 1;
        }
    }
    
}
