package ejercicio3;

import java.util.Scanner;

public class Clase3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        boolean repetir = true;
        StringBuilder cadena = new StringBuilder();
        char [] abecedario = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'Ñ',
                                'O','P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};



        while(repetir){
            System.out.println("Introduce la posición del array que desea mostrar");
            System.out.println("Para dejar de insertar posiciones use -1");
            opcion = sc.nextInt();

            if(opcion == -1){
                repetir = false;
            }
            if(opcion >= 0 && opcion < 27){
                for (int i = 0; i < abecedario.length; i++){
                    if(i == opcion){
                        cadena.append(abecedario[opcion]);
                    }
                }
                System.out.println("Posicion añadidad");
            }
            else{
                System.out.println("Introduce una posicion valida");
            }

        }
        System.out.println("Cadena resultante " + cadena);

    }
}
