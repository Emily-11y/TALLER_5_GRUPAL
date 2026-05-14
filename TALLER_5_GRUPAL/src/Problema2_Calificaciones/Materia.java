
package Problema2_Calificaciones;

public class Materia {
    String nombreMateria;
    double acd, ape, aa;

    public Materia(String nombre, double acd, double ape, double aa) {
        this.nombreMateria = nombre;
        this.acd = acd;
        this.ape = ape;
        this.aa = aa;
    }

    public double calcularSumaTotal() {
        return this.acd + this.ape + this.aa;
    }
    
    public void imprimirDetallesMateria() {
        double total = calcularSumaTotal();
        System.out.print("Materia: " + nombreMateria + " | Notas: [ACD: " + acd + 
                         ", APE: " + ape + ", AA: " + aa + "] | Total: " + total);
    }
}
