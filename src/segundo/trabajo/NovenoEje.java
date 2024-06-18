package segundo.trabajo;

import java.util.Scanner;

public class NovenoEje {

    public static void main(String[] args) {
        Scanner textoScanner=new Scanner(System.in);
        
        System.out.println("ingrese la nota final");
        double f=textoScanner.nextDouble();
        
        if(f>=0 && f<=5){
            if(f>=3){
                System.out.println("paso la materia");
            }else{
                System.out.println("perdio la metia");
            }
        }else{
            System.out.println("no esta entre los parametros");
        }
    }
    
}
