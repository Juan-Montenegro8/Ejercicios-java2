package segundo.trabajo;

import java.util.Scanner;

public class PrimerEje {

    public static void main(String[] args) {
        
        try (Scanner textoScanner = new Scanner(System.in)){
            System.out.println("Escriba el nombre");
            String nombre =  textoScanner.nextLine();
            System.out.println("ingrese edad");
            int edad = textoScanner.nextInt();
            System.out.println("estado civil: ");
            System.out.println("0=soltero");
            System.out.println("1=casado");
            int civil=textoScanner.nextInt();
        
            if(edad>=18 && civil==0){
                System.out.println(""+nombre+" tiene "+edad+" años y esta soltero");
            } else if (edad>=18 && civil==1) {
                System.out.println(""+nombre+" tiene "+edad+" años y esta casado");
            }else{
                System.out.println("es menor de edad o se dijito mal el estado civil");
            }
        } catch (Exception e) {
            System.out.println("Ocurrio un error: "+e.getMessage());
        }
    }
    
}
