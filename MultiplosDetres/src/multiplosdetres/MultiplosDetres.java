package multiplosdetres;

import java.util.Scanner;


public class MultiplosDetres {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int num = sc.nextInt();
        int cont = 0;
        for (int i = 1; i <= num; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
                cont++;
            }
        }
    }
    
}
