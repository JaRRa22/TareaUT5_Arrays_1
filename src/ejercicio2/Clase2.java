package ejercicio2;

import java.util.Scanner;

public class Clase2 {
    public static void rellenarArray(int[] array){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce 10 valores una para cada posicion del array");
        for (int i = 0; i < array.length; i++){
            array[i] = sc.nextInt();
        }
    }
    public static void mostrarArray(int [] array){
        for(int i = 0; i < array.length; i++){
            System.out.println("Indice : " + i + " Valor : " + array[i]);
        }
    }
}
