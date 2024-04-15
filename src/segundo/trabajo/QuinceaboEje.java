package segundo.trabajo;

import java.util.Scanner;

public class QuinceaboEje {

    public static void main(String[] args) {
        Scanner t=new Scanner(System.in);
        
        System.out.println("ingrese un numero");
        int n1=t.nextInt();
        System.out.println("ingrese un numero");
        int n2=t.nextInt();
        System.out.println("ingrese un numero");
        int n3=t.nextInt();
        
        if(n1!=n2 && n2!=n3){
            if(n1>n2 && n1>n3 && n2>n3){
                System.out.println("de mayor a menor"+n1+" - "+n2+" - "+n3);
            }else{
                if(n1>n2 && n1>n3 && n3>n2){
                    System.out.println("de mayor a menor"+n1+" - "+n3+" - "+n2);
                }else{
                    if(n2>n1 && n2>n3 && n1>n3){
                        System.out.println("de mayor a menor"+n2+" - "+n1+" - "+n3);
                    }else{
                        if(n2>n1 && n2>n3 && n3>n1){
                            System.out.println("de mayor a menor"+n2+" - "+n3+" - "+n1);
                        }else{
                            if(n3>n1 && n3>n2 && n1>n2){
                                System.out.println("de mayor a menor"+n3+" - "+n1+" - "+n2);
                            }else{
                                if(n3>n1 && n3>n2 && n2>n1){
                                    System.out.println("de mayor a menor"+n3+" - "+n2+" - "+n1);
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
