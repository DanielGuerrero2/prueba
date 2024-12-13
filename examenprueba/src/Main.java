import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double[] calificaciones = registrarCalificaciones();

        double peorCalificacion = peorCalificacion(calificaciones);
        double mejorCalificion = mejorCalificacion(calificaciones);

        System.out.println("La peor calificación es:");
        System.out.println(peorCalificacion);
        System.out.println("La mejor calificacion es:");
        System.out.println(mejorCalificion);
        promedioGrupal(calificaciones);


    }

    public static double[] registrarCalificaciones() {
        double[] calificaciones = new double[5];
        int i = 0;
        Scanner sc = new Scanner(System.in);


       while (i < 5) {
            System.out.println("Ingresa la calificación del alumno " + (i + 1));
            double calificacion = sc.nextDouble();
            if (calificacion >= 0 && calificacion <= 100) {
                calificaciones[i] = calificacion;
                i++;
            } else {
                System.out.println("La calificación debe ser entre 0 y 100");
            }
        }
        return calificaciones;

    }

    public static double peorCalificacion(double[] calificaciones) {

        double peorCalificacion = 100;
        for (int i = 0; i < 5; i++) {
            if (peorCalificacion > calificaciones[i]) {
                peorCalificacion = calificaciones[i];
            }
        }
        return peorCalificacion;

    }

    public static double mejorCalificacion(double[] calificaciones) {
        double mejorCalificacion = 0;
        for (int i = 0; i < 5; i++) {
            if (mejorCalificacion < calificaciones[i]) {
                mejorCalificacion = calificaciones[i];
            }

        }
        return mejorCalificacion;
    }
    public static void promedioGrupal(double[]calificaciones){
        double promedio =0;
        for(int i =0; i<5; i++){
            promedio+=calificaciones[i];
        }
        System.out.print("El promedio grupal es de: "+(promedio/calificaciones.length));
    }
}