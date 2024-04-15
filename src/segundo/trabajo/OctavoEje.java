package segundo.trabajo;

import java.util.Scanner;

public class OctavoEje {

    public static void main(String[] args) {
        Scanner t=new Scanner(System.in);
        
        System.out.println("escriba un caracter");
        char letra=t.next().charAt(0);
        
        if(Character.isUpperCase(letra)){
            System.out.println("Mayuscula");
        }else{
            System.out.println("Minuscula");
        }
    }
    
}
