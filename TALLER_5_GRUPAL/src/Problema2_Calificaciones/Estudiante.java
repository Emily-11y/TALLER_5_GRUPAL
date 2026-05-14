
package Problema2_Calificaciones;

public class Estudiante {

    String nombre;
    int edad;
    Materia materiaInscrita;

    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void agregarMateria(Materia materia) {
        this.materiaInscrita = materia;
    }

    public void mostrarReporteEstudiante() {
        System.out.print("Estudiante: " + nombre + " (Edad: " + edad + ") | ");

        if (materiaInscrita != null) {
            materiaInscrita.imprimirDetallesMateria();
            double notaFinal = materiaInscrita.calcularSumaTotal();

       
            if (notaFinal >= 7.0) {
                System.out.println(" -> ESTADO: APROBADO ");
            } else {
                double acumulado60 = notaFinal * 0.60;
                System.out.println(" -> ESTADO: RECUPERACIÓN (Acumulado 60%: " + String.format("%.2f", acumulado60) + ")");
            }
        } else {
            System.out.println("Sin materia registrada.");
        }
    }
}