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
                double base1=textoScanner.nextDouble();
                System.out.println("ingrese altura");
                double altura1=textoScanner.nextDouble();
                if(base1>0 && altura1>0){
                    double area1 =(base1*altura1)/2;
                    System.out.println("el area del triangulo "+area1);
                }else{
                    System.out.println("no pueden ir numeros negativos o el 0");
                }
                break;
            case 2:
                System.out.println("ingrese base");
                double base2=textoScanner.nextDouble();
                System.out.println("ingrese cateto1");
                double cateto1=textoScanner.nextDouble();
                System.out.println("ingrese cateto2");
                double cateto2=textoScanner.nextDouble();
                
                if(base2>0 && cateto1>0 && cateto2>0){
                    double semiperimetro =(cateto1+base2+cateto2)/2;
                    double raiz=(semiperimetro*(semiperimetro-cateto1)*(semiperimetro-base2)*(semiperimetro-cateto2));
                    //Cálculo del área usando la fórmula de Herón
                    double area2 = Math.sqrt(raiz);
                
                    System.out.println("el area del triangulo "+area2);
                }else{
                    System.out.println("no pueden ir numeros negativos o el 0");
                }
            default:
                System.out.println("dato invalido");;
        }    
        
    }
    
}
