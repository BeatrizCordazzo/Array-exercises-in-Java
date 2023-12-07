package arraypares;


public class ArrayPares {

    
    public static void main(String[] args) {
        int[] pares = new int[20];
        
        for (int i = 0; i < 20; i++) {
            pares[i] = i * 2;
        }
        
        for (int i = 0; i < 20; i++) {
            System.out.println(pares[i]);
        }
    }
    
}