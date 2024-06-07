package segundo.trabajo;

import java.util.Scanner;

public class SegundoEje {

    public static void main(String[] args) {
        Scanner textoScanner=new Scanner(System.in);
        
        System.out.println("escriba el numero");
        int numero1=textoScanner.nextInt();
        System.out.println("escriba el numero");
        int numero2=textoScanner.nextInt();
        
        if(numero1!=numero2){
            int sum = numero1+numero2;
            int mul = numero1*numero2;
            System.out.println("la suma es "+sum);
            System.out.println("la multiplicacion es "+mul);
        }else{
            System.out.println("los numeros son iguales");
        }
    }
    
}
