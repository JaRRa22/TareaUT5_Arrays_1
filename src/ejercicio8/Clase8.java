package ejercicio8;

public class Clase8 {
    public static char calcularLetra(int dni){
        int resultado = dni % 23;
        char letra = 'X';
        char [] arrayLetras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J',
                'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        for (int i = 0; i < arrayLetras.length; i++) {
            if(resultado == i){
                letra = arrayLetras[i];
                break;
            }
        }
        return letra;
    }
}
