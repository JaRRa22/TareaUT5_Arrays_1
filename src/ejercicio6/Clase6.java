package ejercicio6;

import java.util.Arrays;

public class Clase6 {
    public static void main(String[] args) {
        int pos = 4;
        int posInversa = 0;
        int [] array = {1, 2 ,3, 4, 5};
        int[] arrayInverso = new int[5];

        for(int i = array.length - 1; i >= 0; i--){
            if(i == pos){
                for(int e = 0; e < arrayInverso.length; e++){
                    if(posInversa == e){
                        arrayInverso[posInversa] = array[i];
                        break;
                    }

                }
                posInversa++;
                pos--;
            }

        }
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(arrayInverso));

    }
}
