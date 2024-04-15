package segundo.trabajo;

import java.util.Scanner;

public class SeptimoEje {

    public static void main(String[] args) {
        Scanner t=new Scanner(System.in);
        
        System.out.println("ingrese un numero");
        int n1=t.nextInt();
        System.out.println("ingrese un numero");
        int n2=t.nextInt();
        
        if(n1>=0 && n2<=0){
            System.out.println("el numero "+n1+" es positivo");
        }else{
            if(n1>=0 && n2>=0){
                System.out.println("los numeros "+n1+" y "+n2+" son positivos");
            }else{
                if(n1<=0 && n2>=0){
                    System.out.println("el numero "+n2+" es positivo");
                }else{
                    System.out.println("no hay numeros positivos");
                }
            }
        }
    }
    
}
