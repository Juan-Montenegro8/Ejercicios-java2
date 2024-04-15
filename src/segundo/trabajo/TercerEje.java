package segundo.trabajo;

import java.util.Scanner;

public class TercerEje {
    public static void main(String[] args) {
        Scanner t=new Scanner(System.in);
        
        System.out.println("escriba un numero");
        int nu=t.nextInt();
        
        if(nu%2==0){
            System.out.println(nu+" es par");
        }else{
            System.out.println(nu+" no es par");
        }
    }
    
}
