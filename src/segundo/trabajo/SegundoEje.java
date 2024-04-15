package segundo.trabajo;

import java.util.Scanner;

public class SegundoEje {

    public static void main(String[] args) {
        Scanner t=new Scanner(System.in);
        
        System.out.println("escriba el numero");
        int num1=t.nextInt();
        System.out.println("escriba el numero");
        int num2=t.nextInt();
        
        if(num1!=num2){
            int sum = num1+num2;
            int mul = num1*num2;
            System.out.println("la suma es "+sum);
            System.out.println("la multiplicacion es "+mul);
        }
    }
    
}
