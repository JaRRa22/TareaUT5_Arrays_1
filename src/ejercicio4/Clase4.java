package ejercicio4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Clase4 {
    public static void main(String[] args) {
        System.out.println("Hola");
        System.out.println("Adios");


        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int numeroPosArray;
        System.out.println("Introduce el numero de posiciones del array");
        numeroPosArray = sc.nextInt();

        //int[] mostrarNumeros = new int[10];
        int[] numeros = new int[numeroPosArray];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = rd.nextInt(301);
        }
        System.out.println(Arrays.toString(numeros));

    }
}
