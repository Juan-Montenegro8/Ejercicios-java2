package segundo.trabajo;

import java.util.Scanner;

public class PrimerEje {

    public static void main(String[] args) {
        Scanner t= new Scanner(System.in);
        
        System.out.println("Escriba el nombre");
        String nombre = t.nextLine();
        System.out.println("ingrese edad");
        int edad = t.nextInt();
        System.out.println("estado civil: ");
        System.out.println("0=soltero");
        System.out.println("1=casado");
        int civil=t.nextInt();
        
        if(edad>=18 && civil==0){
            System.out.println(""+nombre+" tiene "+edad+" años y esta "+civil);
        }
    }
    
}
