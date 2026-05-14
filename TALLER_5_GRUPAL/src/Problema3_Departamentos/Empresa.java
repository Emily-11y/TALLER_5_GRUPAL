
package Problema3_Departamentos;
public class Empresa {
    private String nombre;
    private String ruc;
    private String direccion;
    private Departamento[] departamentos;
    private int contador;

    public Empresa(String nombre, String ruc, String direccion, int cantidadDepartamentos) {
        this.nombre = nombre;
        this.ruc = ruc;
        this.direccion = direccion;
        this.departamentos = new Departamento[cantidadDepartamentos];
        this.contador = 0;
    }

    public void agregarDepartamento(Departamento departamento) {
        if (contador < departamentos.length) {
            departamentos[contador] = departamento;
            contador++;
        } else {
            System.out.println("No se pueden agregar mas departamentos.");
        }
    }

    
    public String toString() {
        String texto = "EMPRESA\n" +  "Nombre: " + nombre + "\n" + "RUC: " + ruc + "\n" + "Dirección: " + direccion + "\n\n" +"DEPARTAMENTOS REGISTRADOS\n";

        for (int i = 0; i < contador; i++) {
            texto += "\n" + departamentos[i].toString();
        }

        return texto;
    }
}

