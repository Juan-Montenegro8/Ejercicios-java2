package segundo.trabajo;

import java.util.Scanner;

public class DecimoEje {

    public static void main(String[] args) {
        Scanner textoScanner=new Scanner(System.in);
        
        System.out.println("ingrese un numero");
        int n1=textoScanner.nextInt();
        System.out.println("ingrese un numero");
        int n2=textoScanner.nextInt();
        
        if(n1<n2){
            System.out.println(n2+" es mayor que "+n1);
        }else{
            if(n2<n1){
                System.out.println(n1+" es mayor que "+n2);
            }else{
                System.out.println("los numero son iguales");
            }
        }
    }
    
}
