package ejercicio1;

public class Main {
    public static void main(String[] args) {
        Alumno a1 = new Alumno("Pedro", 10);
        Alumno.rellenarArrayNumeros(0, a1.getNota());
        Alumno.rellenarArrayNombres(0, a1.getNombre());
        Alumno.rellenarArrayEnum(0, a1.getValorNota());

        Alumno a2 = new Alumno("Paco", 1.1f);
        Alumno.rellenarArrayNumeros(1, a2.getNota());
        Alumno.rellenarArrayNombres(1, a2.getNombre());
        Alumno.rellenarArrayEnum(1, a2.getValorNota());

        Alumno a3 = new Alumno("Sergio", 5.9f);
        Alumno.rellenarArrayNumeros(2, a3.getNota());
        Alumno.rellenarArrayNombres(2, a3.getNombre());
        Alumno.rellenarArrayEnum(2, a3.getValorNota());

        Alumno a4 = new Alumno("Maria", 8.5f);
        Alumno.rellenarArrayNumeros(3, a4.getNota());
        Alumno.rellenarArrayNombres(3, a4.getNombre());
        Alumno.rellenarArrayEnum(3, a4.getValorNota());

        Alumno a5 = new Alumno("Lorena", 1.7f);
        Alumno.rellenarArrayNumeros(4, a5.getNota());
        Alumno.rellenarArrayNombres(4, a5.getNombre());
        Alumno.rellenarArrayEnum(4, a5.getValorNota());

        Alumno a6 = new Alumno("Juan", 3.1f);
        Alumno.rellenarArrayNumeros(5, a6.getNota());
        Alumno.rellenarArrayNombres(5, a6.getNombre());
        Alumno.rellenarArrayEnum(5, a6.getValorNota());

        Alumno a7 = new Alumno("Paula", 7.5f);
        Alumno.rellenarArrayNumeros(6, a7.getNota());
        Alumno.rellenarArrayNombres(6, a7.getNombre());
        Alumno.rellenarArrayEnum(6, a7.getValorNota());

        Alumno a8 = new Alumno("Mariano", 4.9f);
        Alumno.rellenarArrayNumeros(7, a8.getNota());
        Alumno.rellenarArrayNombres(7, a8.getNombre());
        Alumno.rellenarArrayEnum(7, a8.getValorNota());

        Alumno a9 = new Alumno("Alberto", 8.9f);
        Alumno.rellenarArrayNumeros(8, a9.getNota());
        Alumno.rellenarArrayNombres(8, a9.getNombre());
        Alumno.rellenarArrayEnum(8, a9.getValorNota());

        Alumno a10 = new Alumno("Laura", 9.99f);
        Alumno.rellenarArrayNumeros(9, a10.getNota());
        Alumno.rellenarArrayNombres(9, a10.getNombre());
        Alumno.rellenarArrayEnum(9, a10.getValorNota());


        System.out.println(Alumno.getNombresAlumnos());
        System.out.println(Alumno.getNotasAlumnos());
        System.out.println(Alumno.getValoresNotas());
        System.out.println("-------------------------------------------------------------------------");

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);
        System.out.println(a5);
        System.out.println(a6);
        System.out.println(a7);
        System.out.println(a8);
        System.out.println(a9);
        System.out.println(a10);





    }
}
