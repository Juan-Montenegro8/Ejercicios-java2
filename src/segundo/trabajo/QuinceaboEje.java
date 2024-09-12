package segundo.trabajo;

import java.util.Scanner;

public class QuinceaboEje {

    public static void main(String[] args) {
        Scanner textoScanner=new Scanner(System.in);
        
        System.out.println("ingrese un numero");
        int numero1=textoScanner.nextInt();
        System.out.println("ingrese un numero");
        int numero2=textoScanner.nextInt();
        System.out.println("ingrese un numero");
        int numero3=textoScanner.nextInt();
        
        if(numero1!=numero2 && numero2!=numero3){
            if(numero1>numero2 && numero1>numero3 && numero2>numero3){
                System.out.println("de mayor a menor"+numero1+" - "+numero2+" - "+numero3);
            }else{
                if(numero1>numero2 && numero1>numero3 && numero3>numero2){
                    System.out.println("de mayor a menor"+numero1+" - "+numero3+" - "+numero2);
                }else{
                    if(numero2>numero1 && numero2>numero3 && numero1>numero3){
                        System.out.println("de mayor a menor"+numero2+" - "+numero1+" - "+numero3);
                    }else{
                        if(numero2>numero1 && numero2>numero3 && numero3>numero1){
                            System.out.println("de mayor a menor"+numero2+" - "+numero3+" - "+numero1);
                        }else{
                            if(numero3>numero1 && numero3>numero2 && numero1>numero2){
                                System.out.println("de mayor a menor"+numero3+" - "+numero1+" - "+numero2);
                            }else{
                                if(numero3>numero1 && numero3>numero2 && numero2>numero1){
                                    System.out.println("de mayor a menor"+numero3+" - "+numero2+" - "+numero1);
                                }
                            }
                        }
                    }
                }
            }    
        }else{
            System.out.println("hay numeros iguales");
        }
                
    }
    
}
