package segundo.trabajo;

import java.util.Scanner;

public class TreceaboEje {

    public static void main(String[] args) {
        Scanner textoScanner=new Scanner(System.in);
        
        System.out.println("solucion de AX+B=0");
        System.out.println("ingrese valor de A");
        double ValorA=textoScanner.nextDouble();
        System.out.println("ingrese valor de B");
        double ValorB=textoScanner.nextDouble();
        
        if(ValorA!=0){
            if((ValorA>0 && ValorB>=0)){
                double resultado=-(ValorB/ValorA);
                System.out.println("el resultado es "+resultado);
            }else{
                if((ValorA<0 && ValorB>=0) || (ValorA>0 && ValorB<0)){
                    double resultado=-1*(ValorB/ValorA);
                    System.out.println("el resultado es "+resultado);
                }else{
                    if(ValorA<0 && ValorB<0){
                        double resultado=(ValorB/ValorA);
                        System.out.println("el resultado es "+resultado);
                    }
                }
            }    
        }else{
            System.out.println("la letra A no puede ir negativa");
        }
                
    }
    
}
