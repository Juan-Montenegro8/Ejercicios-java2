package segundo.trabajo;

import java.util.Scanner;

public class SextoEje {

    public static void main(String[] args) {
        Scanner textoScanner=new Scanner(System.in);
        
        System.out.println("ingrese numero");
        double numero=textoScanner.nextDouble();
        
        if(numero>=0){
            double raiz=Math.sqrt(numero);
            System.out.println("la raiz del numero es "+raiz);
        }else{
            System.out.println("no tiene raiz");
        }
    }
    
}
