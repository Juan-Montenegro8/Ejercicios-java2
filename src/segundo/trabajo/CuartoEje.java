package segundo.trabajo;

import java.util.Scanner;

public class CuartoEje {

    public static void main(String[] args) {
        Scanner t=new Scanner(System.in);
        
        System.out.println("Precio por hora");
        double ph=t.nextDouble();
        System.out.println("horas trabajada");
        double ht=t.nextDouble();
        System.out.println("horas extras");
        double hx=t.nextDouble();
        
        double vp=ph*ht;
        double ex=ph*hx;
        double tota=vp+ex;
        
        if(tota<=500000){
            double jj=tota*0.03;
            double total=tota-jj;
            System.out.println("el salario es de "+total);
        }else{
            double jj=tota*0.05;
            double total=tota-jj;
            System.out.println("el salario es de "+total);
        }
        
    }
    
}
