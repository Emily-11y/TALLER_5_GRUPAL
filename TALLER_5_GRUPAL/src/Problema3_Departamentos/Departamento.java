
package Problema3_Departamentos;
public class Departamento {
    private String nombre;
    private int numeroEmpleados;
    private double produccionAnual;
    private String categoria;

    public Departamento(String nombre, int numeroEmpleados, double produccionAnual) {
        this.nombre = nombre;
        this.numeroEmpleados = numeroEmpleados;
        this.produccionAnual = produccionAnual;
        calcularCategoria();
    }

    public void calcularCategoria() {
        if (numeroEmpleados > 20 && produccionAnual > 1000000) {
            categoria = "A";
        } else if (numeroEmpleados >= 20 && produccionAnual >= 1000000) {
            categoria = "B";
        } else if (numeroEmpleados >= 10 && produccionAnual >= 500000) {
            categoria = "C";
        } else {
            categoria = "Sin categoría";
        }
    }
   
    public String toString() {
        return "Departamento: " + nombre +
               "\nNúmero de empleados: " + numeroEmpleados +
               "\nProducción anual: $" + produccionAnual +
               "\nCategoria: " + categoria + "\n";
    }
}
