package segundo.trabajo;

import java.util.Scanner;

public class TreceaboEje {

    public static void main(String[] args) {
        Scanner t=new Scanner(System.in);
        
        System.out.println("solucion de AX+B=0");
        System.out.println("ingrese valor de A");
        double a=t.nextDouble();
        System.out.println("ingrese valor de B");
        double b=t.nextDouble();
        
        if(a!=0){
            if((a>0 && b>=0)){
                double res=-(b/a);
                System.out.println("el resultado es "+res);
            }else{
                if((a<0 && b>=0) || (a>0 && b<0)){
                    double res=-1*(b/a);
                    System.out.println("el resultado es "+res);
                }else{
                    if(a<0 && b<0){
                        double res=(b/a);
                        System.out.println("el resultado es "+res);
                    }
                }
            }    
        }else{
            System.out.println("la letra A no puede ir negativa");
        }
                
    }
    
}
