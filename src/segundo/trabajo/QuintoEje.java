package segundo.trabajo;

import java.util.Scanner;

public class QuintoEje {

    public static void main(String[] args) {
        
        try (Scanner textScanner= new Scanner(System.in)) {
            
            System.out.println("ingrese un numero");
            int numero1=textScanner.nextInt();
            System.out.println("ingrese un numero");
            int numero2=textScanner.nextInt();
        
            if(numero1==numero2){
                int suma=numero1+numero2;
                System.out.println("la suma es "+suma);
            }else{
                int resta=numero1-numero2;
                System.out.println("la diferencia es "+resta);
            }    
        } catch (Exception e) {
            System.out.println("Ocurrio un error: "+e.getMessage());
        }
    }
    
}
