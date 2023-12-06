package s_o_n;

import java.util.Scanner;


public class S_o_N {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String resp = " ";
        while(!resp.equals("s") && !resp.equals("n")){
            System.out.println("Introduce S o N");
            resp = sc.nextLine().toLowerCase();
        }
    }
    
}
