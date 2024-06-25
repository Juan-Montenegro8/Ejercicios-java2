package segundo.trabajo;

import java.util.Scanner;

public class DoceavoEje {

    public static void main(String[] args) {
        Scanner textoScanner=new Scanner(System.in);
        
        System.out.println("ingrese el caracter");
        char caracter=textoScanner.next().charAt(0);
        
        if(caracter=='a' || caracter=='e' || caracter=='i' || caracter=='o' || caracter=='u'
                || caracter=='A' || caracter=='E' || caracter=='I' || caracter=='O' || caracter=='U'){
            if(Character.isUpperCase(caracter)){
                System.out.println("es una vocal mayuscula");
            }else{
                System.out.println("es una vocal minuscula");
            }
        }else{
            System.out.println("no es vocal");
        }
    }
    
}
