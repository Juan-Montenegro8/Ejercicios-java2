package segundo.trabajo;

import java.util.Scanner;

public class QuintoEje {

    public static void main(String[] args) {
        Scanner t= new Scanner(System.in);
        
        System.out.println("ingrese un numero");
        int nu1=t.nextInt();
        System.out.println("ingrese un numero");
        int nu2=t.nextInt();
        
        if(nu1==nu2){
            int re=nu1+nu2;
            System.out.println("la suma es "+re);
        }else{
            int re=nu1-nu2;
            System.out.println("la diferencia es "+re);
        }
    }
    
}
