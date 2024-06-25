package segundo.trabajo;

import java.util.Scanner;

public class DoceavoEje {

    public static void main(String[] args) {
        Scanner textoScanner=new Scanner(System.in);
        
        System.out.println("ingrese el caracter");
        char letra=textoScanner.next().charAt(0);
        
        if(letra=='a' || letra=='e' || letra=='i' || letra=='o' || letra=='u'
                || letra=='A' || letra=='E' || letra=='I' || letra=='O' || letra=='U'){
            if(Character.isUpperCase(letra)){
                System.out.println("es una vocal mayuscula");
            }else{
                System.out.println("es una vocal minuscula");
            }
        }else{
            System.out.println("no es vocal");
        }
    }
    
}
