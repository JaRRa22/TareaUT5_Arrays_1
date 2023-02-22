package ejercicio8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dni = 0;
        boolean repetir = true;

        while(repetir){
            System.out.println("Introduce los 8 digitos de tu dni");
            dni = sc.nextInt();
            if(dni > 10000000 && dni < 100000000){
                repetir = false;
            }
            else{
                System.out.println("Introduzca un dni válido");
            }
        }
        System.out.println("Los digitos de su dni son : " + dni);
        System.out.println("LA letra de su dni es : " + Clase8.calcularLetra(dni));

    }
}
