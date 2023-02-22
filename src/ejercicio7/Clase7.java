package ejercicio7;

import java.util.Arrays;

public class Clase7 {
    public static void main(String[] args) {
        int [] miArray = {10, 100, 32, 323, 75, 234, 43};
        int [] miArray2 = new int[7];

        for (int i = 0; i < miArray2.length; i++) {
            if(miArray[i] > 25 && miArray[i] % 2 == 0)
                miArray2[i] = miArray[i];
        }
        System.out.println(Arrays.toString(miArray));
        System.out.println(Arrays.toString(miArray2));
    }
}
