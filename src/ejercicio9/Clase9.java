package ejercicio9;

import java.util.Random;

public class Clase9 {
    public static void rellenarArrays(int [] array1, int [] array2){
        Random rd = new Random();
        for (int i = 0; i < array1.length; i++) {
            array1[i] = rd.nextInt(51);
        }
        System.arraycopy(array1, 0, array2, 0, array2.length);
    }
    public static int [] rellenarArrayMultiplicado(int [] array1, int [] array2){
        int [] arrayMultiplicado = new int[array1.length];
        for(int i = 0; i < arrayMultiplicado.length; i++){
            arrayMultiplicado[i] = array1[i] * array2[i];
        }
        return arrayMultiplicado;
    }
}
