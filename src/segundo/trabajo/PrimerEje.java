package segundo.trabajo;

import java.util.Scanner;

public class PrimerEje {

    public static void main(String[] args) {
        Scanner texto= new Scanner(System.in);
        
        System.out.println("Escriba el nombre");
        String nombre =  texto.nextLine();
        System.out.println("ingrese edad");
        int edad = texto.nextInt();
        System.out.println("estado civil: ");
        System.out.println("0=soltero");
        System.out.println("1=casado");
        int civil=texto.nextInt();
        
        if(edad>=18 && civil==0){
            System.out.println(""+nombre+" tiene "+edad+" años y esta soltero");
        } else if (edad>=18 && civil==1) {
            System.out.println(""+nombre+" tiene "+edad+" años y esta casado");
        }else{
            System.out.println("es menor de edad o se dijito mal el estado civil");
        }
    }
    
}
