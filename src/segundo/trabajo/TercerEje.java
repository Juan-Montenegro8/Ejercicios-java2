package segundo.trabajo;

import java.util.Scanner;

public class TercerEje {
    public static void main(String[] args) {
        
        try (Scanner textoScanner=new Scanner(System.in)) {
            System.out.println("escriba un numero");
            int numero=textoScanner.nextInt();
        
            if(numero%2==0){
                System.out.println(numero+" es par");
            }else{
                System.out.println(numero+" no es par");
            }
        } catch (Exception e) {
            System.out.println("Ocurrio un error: "+e.getMessage());
        }
    }
    
}
