package segundo.trabajo;

import java.util.Scanner;

public class CatorceaboEje {

    public static void main(String[] args) {
         
        try (Scanner textoScanner=new Scanner(System.in)) {
            System.out.println("resolver ax^2+bx+c=0");
            System.out.println("ingrese valor de a");
            double ValorA=textoScanner.nextDouble();
            System.out.println("ingrese valor de b");
            double ValorB=textoScanner.nextDouble();
            System.out.println("ingrese valor de c");
            double ValorC=textoScanner.nextDouble();
        
            if(ValorA!=0 && ValorB!=0){
                double potencia=Math.pow(ValorB, 2);
                double Raiz=potencia-4*ValorA*ValorC;
                if(Raiz>=0){
                    double ResultadoRaiz=Math.sqrt(Raiz);
                    double resultado1=(-ValorB+ResultadoRaiz)/2*ValorA;
                    double resultado2=(-ValorB-ResultadoRaiz)/2*ValorA;
                    System.out.println("resultado 1= "+resultado1);
                    System.out.println("resultado 2= "+resultado2);     
                }else{
                    System.out.println("no se le puede sacar raiz cuadrada numero negativo");
                }
                        
            }else{
                System.out.println("el valor A y B no puden equivaler 0");
            }
        } catch (Exception e) {
            System.out.println("Ocurrio un error: "+e.getMessage());
        }
    }
    
}
