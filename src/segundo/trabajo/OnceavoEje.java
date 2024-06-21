package segundo.trabajo;

import java.util.Scanner;

public class OnceavoEje {

    public static void main(String[] args) {
        Scanner textoScanner=new Scanner(System.in);
        
        System.out.println("si el triangulo es rectangulo digite 1");
        System.out.println("sino digite 2");
        int rectangulo=textoScanner.nextInt();
        
        switch (rectangulo) {
            case 1:                
                System.out.println("ingrese base");
                double base=textoScanner.nextDouble();
                System.out.println("ingrese altura");
                double altura=textoScanner.nextDouble();
                if(base>0 && altura>0){
                    double area =(base*altura)/2;
                    System.out.println("el area del triangulo "+area);
                }else{
                    System.out.println("no pueden ir numeros negativos o el 0");
                }
                break;
            case 2:
                System.out.println("ingrese base");
                double b1=textoScanner.nextDouble();
                System.out.println("ingrese cateto1");
                double a1=textoScanner.nextDouble();
                System.out.println("ingrese cateto2");
                double c=textoScanner.nextDouble();
                
                if(b1>0 && a1>0 && c>0){
                    double s=(a1+b1+c)/2;
                    double rai=(s*(s-a1)*(s-b1)*(s-c));
                    double area1 = Math.sqrt(rai);
                
                    System.out.println("el area del triangulo "+area1);
                }else{
                    System.out.println("no pueden ir numeros negativos o el 0");
                }
            default:
                System.out.println("dato invalido");;
        }    
        
    }
    
}
