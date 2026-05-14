
package Problema5_GestionConflic;

public class Conflicto {
    private String nombre;
    private String fechaInicio;
    private String estadoActual;
    private String paises[];
    private Evento eventos[];
    private int contadorEventos;

    public Conflicto(String nombre,String fechaInicio,String estadoActual,String paises[]) {

        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.estadoActual = estadoActual;
        this.paises = paises;
        this.eventos = new Evento[100];
        this.contadorEventos = 0;
    }

    public void agregarEvento(Evento e) {
        eventos[contadorEventos] = e;
        contadorEventos++;
        verificarEstado(e);
    }

    public void listarEventos() {
        if (contadorEventos == 0) {
            System.out.println("No existen eventos registrados");
        }
        else {
            for (int i = 0; i < contadorEventos; i++) {
                System.out.println(eventos[i]);
            }
        }
    }


    public void buscarEvento(String nombreEvento) {
        boolean encontrado = false;
        for (int i = 0; i < contadorEventos; i++) {
            if (eventos[i].getNombreEvento().equalsIgnoreCase(nombreEvento)) {
                System.out.println(eventos[i]);
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("Evento no encontrado");
        }
    }

    public void actualizarEvento(String nombreEvento,String nuevaDescripcion) {
        boolean encontrado = false;
        for (int i = 0; i < contadorEventos; i++) {
            if (eventos[i].getNombreEvento().equalsIgnoreCase(nombreEvento)) {
                eventos[i].setDescripcion(nuevaDescripcion);
                System.out.println("Evento actualizado correctamente");
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("Evento no encontrado");
        }
    }

    public int contarBatallas() {
        int contador = 0;
        for (int i = 0; i < contadorEventos; i++) {
            if (eventos[i].getTipoEvento().equalsIgnoreCase("Batalla")) {
                contador++;
            }
        }
        return contador;
    }

    public void verificarEstado(Evento e) {

        if (e.getCantidadPaisesBatalla() > 98) {
            estadoActual = "GUERRA MUNDIAL";
            System.out.println("\n⚠ GUERRA MUNDIAL DECLARADA");
        } else if (e.getCantidadPaisesBatalla() >= 58 && e.getCantidadPaisesBatalla() <= 98) {
            estadoActual = "REUNION URGENTE ONU";
            System.out.println("\n⚠ ONU CONVOCADA URGENTEMENTE");
        }

        if (e.isArmasNucleares()) {
            estadoActual = "GUERRA MUNDIAL";
            System.out.println("\n⚠ ARMAS NUCLEARES DETECTADAS");
        }

        if (e.getPorcentajeBajas() >= 50) {
            estadoActual = "CONVOCATORIA URGENTE ONU";
            System.out.println("\n⚠ MUCHAS BAJAS HUMANAS");
        }
    }

    public void mostrarEstado() {
        System.out.println("\nESTADO ACTUAL: " + estadoActual);
    }

    public String toString() {
        String listaPaises = "";
        for (int i = 0; i < paises.length; i++) {
            listaPaises += paises[i] + " ";
        }
        String listaEventos = "";
        for (int i = 0; i < contadorEventos; i++) {
            listaEventos += eventos[i] + "\n";
        }
        return "\n===============================" +
               "\nCONFLICTO INTERNACIONAL" +
               "\n===============================" +
               "\nNombre: " + nombre +
               "\nFecha Inicio: " + fechaInicio +
               "\nEstado Actual: " + estadoActual +
               "\nPaises Involucrados: " + listaPaises +
               "\nCantidad Eventos: " + contadorEventos +
               "\nCantidad Batallas: " + contarBatallas() +
               "\n\nEVENTOS:\n" +
               listaEventos;
    }
}


