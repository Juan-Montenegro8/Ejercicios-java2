package segundo.trabajo;

import java.util.Scanner;

public class DecimoEje {

    public static void main(String[] args) {
        Scanner textoScanner=new Scanner(System.in);
        
        System.out.println("ingrese un numero");
        int numero1=textoScanner.nextInt();
        System.out.println("ingrese un numero");
        int numero2=textoScanner.nextInt();
        
        if(numero1<numero2){
            System.out.println(numero2+" es mayor que "+numero1);
        }else{
            if(numero2<numero1){
                System.out.println(numero1+" es mayor que "+numero2);
            }else{
                System.out.println("los numero son iguales");
            }
        }
    }
    
}
