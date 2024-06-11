package segundo.trabajo;

import java.util.Scanner;

public class CuartoEje {

    public static void main(String[] args) {
        Scanner textoScanner=new Scanner(System.in);
        
        System.out.println("Precio por hora");
        double PrecioHora=textoScanner.nextDouble();
        System.out.println("horas trabajada");
        double HoraTrabjada=textoScanner.nextDouble();
        System.out.println("horas extras");
        double HorasExtra=textoScanner.nextDouble();
        
        double ValorHora=PrecioHora*HoraTrabjada;
        double ValorExtra=PrecioHora*HorasExtra;
        double total=ValorHora+ValorExtra;
        
        if(total<=500000){
            double descuento=total*0.03;
            double Pagar=total-descuento;
            System.out.println("el salario es de "+Pagar);
        }else{
            double descuento=total*0.05;
            double Pagar=total-descuento;
            System.out.println("el salario es de "+Pagar);
        }
        
    }
    
}
