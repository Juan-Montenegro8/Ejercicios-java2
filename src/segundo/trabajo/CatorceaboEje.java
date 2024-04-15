package segundo.trabajo;

import java.util.Scanner;

public class CatorceaboEje {

    public static void main(String[] args) {
        Scanner t=new Scanner(System.in);
        
        System.out.println("resolver ax^2+bx+c=0");
        System.out.println("ingrese valor de a");
        double a=t.nextDouble();
        System.out.println("ingrese valor de b");
        double b=t.nextDouble();
        System.out.println("ingrese valor de c");
        double c=t.nextDouble();
        
        if(a!=0 && b!=0){
            double pot=Math.pow(b, 2);
            double jj1=pot-4*a*c;
            if(jj1>=0){
                double j=Math.sqrt(jj1);
                double resul1=(-b+j)/2*a;
                double resul2=(-b-j)/2*a;
                System.out.println("resultado 1= "+resul1);
                System.out.println("resultado 2= "+resul2);     
            }else{
                System.out.println("no se le puede sacar raiz cuadrada numero negativo");
            }
                        
        }else{
            System.out.println("el valor A y B no puden equivaler 0");
        }
                       
    }
    
}
