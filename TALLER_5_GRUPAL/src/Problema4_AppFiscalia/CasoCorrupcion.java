
package Problema4_AppFiscalia;
public class CasoCorrupcion {
    private String nombreCaso;
    private String fechaInicio;
    private int diasTranscurridos;
    private String estado;
    private String detalle;
    private double danoEconomico;

    private PersonaImplicada[] personas;
    private int contador;

    public CasoCorrupcion(String nombreCaso,String fechaInicio,int diasTranscurridos,String detalle,double danoEconomico,int cantidadPersonas) {
        this.nombreCaso = nombreCaso;
        this.fechaInicio = fechaInicio;
        this.diasTranscurridos = diasTranscurridos;
        this.detalle = detalle;
        this.danoEconomico = danoEconomico;
        personas = new PersonaImplicada[cantidadPersonas];
        contador = 0;
        actualizarEstado();
    }

    public void actualizarEstado() {

        if (diasTranscurridos > 14) {
            estado = "Urgente";
        } else if (diasTranscurridos > 7) {
            estado = "Alerta";
        } else {
            estado = "Iniciado";
        }
    }

    public void agregarPersona(PersonaImplicada persona) 
    {if (contador < personas.length) {
            persona.calcularBeneficio(danoEconomico);
            personas[contador] = persona;
            contador++;
        } else {
           System.out.println("No se pueden agregar mas personas.");
        }
    }

    @Override
    public String toString() {String texto = "========== CASO ==========\n";texto += "Nombre del caso: " + nombreCaso + "\n";texto += "Fecha de inicio: " + fechaInicio + "\n";
        texto += "Dias transcurridos: " + diasTranscurridos + "\n";texto += "Estado: " + estado + "\n";texto += "Detalle: " + detalle + "\n";texto += "Dano economico: $" + danoEconomico + "\n";texto += "\n====== PERSONAS ======\n";
        for (int i = 0; i < contador; i++) {
            texto += "\n" + personas[i].toString();
        }
        return texto;
    }
}
