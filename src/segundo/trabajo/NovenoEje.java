package segundo.trabajo;

import java.util.Scanner;

public class NovenoEje {

    public static void main(String[] args) {
        
        try (Scanner textoScanner=new Scanner(System.in)) {
            System.out.println("ingrese la nota final");
            double nota=textoScanner.nextDouble();
        
            if(nota>=0 && nota<=5){
                if(nota>=3){
                    System.out.println("paso la materia");
                }else{
                    System.out.println("perdio la metia");
                }
            }else{
                System.out.println("no esta entre los parametros");
            }
        } catch (Exception e) {
            System.out.println("Ocurrio un error: "+e.getMessage());
        }
    }
    
}
