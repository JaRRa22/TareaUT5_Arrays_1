package ejercicio2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arrayNumeros = new int[10];

        Clase2.rellenarArray(arrayNumeros);
        System.out.println(Arrays.toString(arrayNumeros));
        Clase2.mostrarArray(arrayNumeros);
    }
}
