package ejercicio9;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tamanioArray;

        System.out.println("Introduce el tamanio del array");
        tamanioArray = sc.nextInt();
        int [] array1 = new int[tamanioArray];
        int [] arrayCopia = new int[tamanioArray];

        Clase9.rellenarArrays(array1, arrayCopia);
        System.out.println("Primer array = " + Arrays.toString(array1));
        System.out.println("Array copia = " + Arrays.toString(arrayCopia));

        System.out.println("Tercer array " + Arrays.toString(Clase9.rellenarArrayMultiplicado(array1, arrayCopia)));
    }
}
