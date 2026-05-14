
package Problema5_GestionConflic;

public class Evento {

    private String nombreEvento;
    private String tipoEvento;
    private String fecha;
    private String ubicacion;
    private String descripcion;
    private boolean armasNucleares;
    private double porcentajeBajas;
    private int cantidadPaisesBatalla;

    public Evento(String nombreEvento,String tipoEvento,String fecha,String ubicacion,String descripcion,
                  boolean armasNucleares, double porcentajeBajas, int cantidadPaisesBatalla) {
        this.nombreEvento = nombreEvento;
        this.tipoEvento = tipoEvento;
        this.fecha = fecha;
        this.ubicacion = ubicacion;
        this.descripcion = descripcion;
        this.armasNucleares = armasNucleares;
        this.porcentajeBajas = porcentajeBajas;
        this.cantidadPaisesBatalla = cantidadPaisesBatalla;
    }

    public String getNombreEvento() {
        return nombreEvento;
    }

    public String getTipoEvento() {
        return tipoEvento;
    }

    public boolean getArmasNucleares() {
        return armasNucleares;
    }

    public double getPorcentajeBajas() {
        return porcentajeBajas;
    }

    public int getCantidadPaisesBatalla() {
        return cantidadPaisesBatalla;
    }
    public String getFecha() {
        return fecha;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public boolean isArmasNucleares() {
        return armasNucleares;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setNombreEvento(String nombreEvento) {
        this.nombreEvento = nombreEvento;
    }

    public void setTipoEvento(String tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void setArmasNucleares(boolean armasNucleares) {
        this.armasNucleares = armasNucleares;
    }

    public void setPorcentajeBajas(double porcentajeBajas) {
        this.porcentajeBajas = porcentajeBajas;
    }

    public void setCantidadPaisesBatalla(int cantidadPaisesBatalla) {
        this.cantidadPaisesBatalla = cantidadPaisesBatalla;
    }
    
    public String toString() {
        return "\n=========== EVENTO ===========" +
               "\nNombre Evento: " + nombreEvento +
               "\nTipo Evento: " + tipoEvento +
               "\nFecha: " + fecha +
               "\nUbicacion: " + ubicacion +
               "\nDescripcion: " + descripcion +
               "\nArmas Nucleares: " + armasNucleares +
               "\nPorcentaje Bajas: " + porcentajeBajas +
               "\nCantidad Paises Batalla: " + cantidadPaisesBatalla;
    }
}


