package segundo.trabajo;



public class Ciclo {

    public static void main(String[] args) {
        
        int contador=1;
        while (contador<=100){

            System.out.println(contador+". azul");
            contador++;
            
            for(int j=0;j< 2 && contador<=100;j++){
                System.out.println(contador+". verde");
                contador++;
            }

            for(int j=0;j< 3 && contador<=100;j++){
                System.out.println(contador+". rojo");
                contador++;
            }
        }
                
    }
    
}

//OTRA OPCION

      /*final String RESET = "\033[0m"; // Resetea el color
        final String BLUE = "\033[34m"; // Azul
        final String GREEN = "\033[32m"; // Verde
        final String RED = "\033[31m";   // Rojo

        int num = 1;
        while (num <= 100) {
            // Imprime el primer número en azul
            System.out.print(BLUE + num + RESET + " ");
            num++;

            // Imprime dos números en verde
            for (int i = 0; i < 2 && num <= 100; i++) {
                System.out.print(GREEN + num + RESET + " ");
                num++;
            }

            // Imprime tres números en rojo
            for (int i = 0; i < 3 && num <= 100; i++) {
                System.out.print(RED + num + RESET + " ");
                num++;
            }

            System.out.println(); // Nueva línea después de cada grupo
        }*/