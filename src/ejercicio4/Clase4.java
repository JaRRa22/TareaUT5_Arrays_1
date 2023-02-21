package ejercicio4;

import java.util.Arrays;
import java.util.Random;

public class Clase4 {

    private static int[] array;
    public static Boolean rellenarArray(int numero){
        if(numero > 0 && numero <= 10){
            Random rd = new Random();
            System.out.println("Introduce el numero de posiciones del array");
            array = new int [numero];
            for(int i = 0; i < array.length; i++){
                array[i] = rd.nextInt(301);
            }
            return true;
        }
        return false;
    }
    public static String mostrarArrayDeDigitos(int ultimoDigito){
        int pos = 0;
        int [] nuevoArray = new int[10];
        for(int i = 0; i < array.length; i++){
            if(array[i] % 10 == ultimoDigito){
                for(int e = 0; e < nuevoArray.length; e++){
                    nuevoArray[pos] = array[i];
                }
                pos++;
            }
        }
        return Arrays.toString(nuevoArray);
    }
}
