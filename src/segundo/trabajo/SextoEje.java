package segundo.trabajo;

import java.util.Scanner;

public class SextoEje {

    public static void main(String[] args) {
        Scanner textoScanner=new Scanner(System.in);
        
        System.out.println("ingrese numero");
        double nu=textoScanner.nextDouble();
        
        if(nu>=0){
            double rai=Math.sqrt(nu);
            System.out.println("la raiz del numero es "+rai);
        }else{
            System.out.println("no tiene raiz");
        }
    }
    
}
