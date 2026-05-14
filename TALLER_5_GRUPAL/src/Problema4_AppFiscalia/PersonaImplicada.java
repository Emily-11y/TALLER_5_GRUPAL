
package Problema4_AppFiscalia;
public class PersonaImplicada {
     private String nombre;
    private int edad;
    private String ocupacion;
    private String nivelImplicacion;
    private int sentenciaMeses;
    private boolean colabora;
    private double fianza;

    public PersonaImplicada(String nombre, int edad,String ocupacion,String nivelImplicacion,int sentenciaMeses,boolean colabora) {
        this.nombre = nombre;
        this.edad = edad;
        this.ocupacion = ocupacion;
        this.nivelImplicacion = nivelImplicacion;
        this.sentenciaMeses = sentenciaMeses;
        this.colabora = colabora;
        this.fianza = 0;
    }

    public void calcularBeneficio(double danoEconomico) {
        if (nivelImplicacion.equalsIgnoreCase("acusado")&& colabora == true) {
            sentenciaMeses = sentenciaMeses / 2;
            if (sentenciaMeses < 12) {fianza = danoEconomico * 0.50;
            }
        }
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nEdad: " + edad+ "\nOcupacion: " + ocupacion+ "\nNivel de implicacion: " + nivelImplicacion+ "\nSentencia (meses): " + sentenciaMeses+ "\nColabora: " + colabora
        + "\nFianza: $" + fianza + "\n";
    }
}