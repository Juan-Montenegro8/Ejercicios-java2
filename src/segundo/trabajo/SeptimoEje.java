package segundo.trabajo;

import java.util.Scanner;

public class SeptimoEje {

    public static void main(String[] args) {
        Scanner textoScanner=new Scanner(System.in);
        
        System.out.println("ingrese un numero");
        int numero1=textoScanner.nextInt();
        System.out.println("ingrese un numero");
        int numero2=textoScanner.nextInt();
        
        if(numero1>=0 && numero2<=0){
            System.out.println("el numero "+numero1+" es positivo");
        }else{
            if(numero1>=0 && numero2>=0){
                System.out.println("los numeros "+numero1+" y "+numero2+" son positivos");
            }else{
                if(numero1<=0 && numero2>=0){
                    System.out.println("el numero "+numero2+" es positivo");
                }else{
                    System.out.println("no hay numeros positivos");
                }
            }
        }
    }
    
}
