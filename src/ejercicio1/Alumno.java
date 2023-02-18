package ejercicio1;

import java.util.Arrays;

public class Alumno {
    private static final float[] NOTASALUMNOS = new float[10];
    private static final String[] NOMBRESALUMNOS = new String[10];
    private String nombre;
    private float nota;
    private Notas valorNota;

    public Alumno(String nombre, float nota) {
        this.nombre = nombre;
        if (nota < 0 || nota > 10) {
            this.nota = 0;
        } else {
            this.nota = nota;
        }

        if (nota < 0 || nota > 10) {
            this.valorNota = Notas.NOTA_INVALIDA;
        }
        if (nota >= 0 && nota < 5) {
            this.valorNota = Notas.SUSPENSO;
        }
        if (nota >= 5 && nota < 6.99) {
            this.valorNota = Notas.BIEN;
        }
        if (nota >= 7 && nota < 8.99) {
            this.valorNota = Notas.NOTABLE;
        }
        if (nota >= 9 && nota <= 10) {
            this.valorNota = Notas.SOBRESALIENTE;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public float getNota() {
        return nota;
    }

    public Notas getValorNota() {
        return valorNota;
    }

    public static String getNotasAlumnos() {
        return Arrays.toString(NOTASALUMNOS);
    }

    public static String getNombresAlumnos() {
        return Arrays.toString(NOMBRESALUMNOS);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public void setValorNota(Notas valorNota) {
        this.valorNota = valorNota;
    }

    public static void rellenarArrayNumeros(int pos, float nota) {
        for (int i = 0; i < NOTASALUMNOS.length; i++) {
            switch (pos) {
                case 0:
                    NOTASALUMNOS[0] = nota;
                case 1:
                    NOTASALUMNOS[1] = nota;
                case 2:
                    NOTASALUMNOS[2] = nota;
                case 3:
                    NOTASALUMNOS[3] = nota;
                case 4:
                    NOTASALUMNOS[4] = nota;
                case 5:
                    NOTASALUMNOS[5] = nota;
                case 6:
                    NOTASALUMNOS[6] = nota;
                case 7:
                    NOTASALUMNOS[7] = nota;
                case 8:
                    NOTASALUMNOS[8] = nota;
                case 9:
                    NOTASALUMNOS[9] = nota;
            }
        }
    }

    public static void rellenarArrayNombres(int pos, String nombre) {
        for (int i = 0; i < NOMBRESALUMNOS.length; i++) {
            switch (pos) {
                case 0:
                    NOMBRESALUMNOS[0] = nombre;
                case 1:
                    NOMBRESALUMNOS[1] = nombre;
                case 2:
                    NOMBRESALUMNOS[2] = nombre;
                case 3:
                    NOMBRESALUMNOS[3] = nombre;
                case 4:
                    NOMBRESALUMNOS[4] = nombre;
                case 5:
                    NOMBRESALUMNOS[5] = nombre;
                case 6:
                    NOMBRESALUMNOS[6] = nombre;
                case 7:
                    NOMBRESALUMNOS[7] = nombre;
                case 8:
                    NOMBRESALUMNOS[8] = nombre;
                case 9:
                    NOMBRESALUMNOS[9] = nombre;
            }
        }
    }

    @Override
    public String toString () {
        return "El nombre del alumno es " + getNombre() + ", su nota es un " + getNota() + " y su resultado es " + getValorNota();
    }
}