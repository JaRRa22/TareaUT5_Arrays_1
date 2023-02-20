package ejercicio3;

import java.util.Arrays;
import java.util.Scanner;

public class Clase3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        boolean repetir = true;
        StringBuilder cadena = new StringBuilder();
        char [] abecedario = new char[26];
        char inicial = 'A';

        for(int i = 0; i < abecedario.length; i++){
            abecedario[i] = inicial;
            inicial++;
        }
        System.out.println(Arrays.toString(abecedario));



        while(repetir){
            System.out.println("Introduce la posición del array que desea mostrar");
            System.out.println("Para dejar de insertar posiciones use -1");
            opcion = sc.nextInt();

            if(opcion == -1){
                repetir = false;
            }
            if(opcion >= 0 && opcion < 26){
                for (int i = 0; i < abecedario.length; i++){
                    if(i == opcion){
                        cadena.append(abecedario[opcion]);
                    }
                }
                System.out.println("Añadirá la " + abecedario[opcion]);
            }
            else{
                System.out.println("Introduce una posicion valida");
            }

        }
        System.out.println("Cadena resultante : " + cadena);

    }
}
