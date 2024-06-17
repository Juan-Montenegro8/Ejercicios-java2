package segundo.trabajo;

import java.util.Scanner;

public class OctavoEje {

    public static void main(String[] args) {
        Scanner textoScanner=new Scanner(System.in);
        
        System.out.println("escriba un caracter");
        char caracter=textoScanner.next().charAt(0);
        
        if(Character.isUpperCase(caracter)){
            System.out.println("Mayuscula");
        }else{
            System.out.println("Minuscula");
        }
    }
    
}
