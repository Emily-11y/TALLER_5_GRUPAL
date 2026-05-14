
package Problema5_GestionConflic;
import java.util.Scanner;
public class Ejecutor {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.println("=================================");
        System.out.println("SISTEMA GESTION DE CONFLICTOS");
        System.out.println("=================================");

        System.out.print("Nombre conflicto: ");
        String nombre = tcl.nextLine();
        System.out.print("Fecha inicio: ");
        String fecha = tcl.nextLine();
        System.out.print("Cantidad paises involucrados: ");
        int n = tcl.nextInt();
        tcl.nextLine();

        String paises[] = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Pais " + (i + 1) + ": ");
            paises[i] = tcl.nextLine();
        }

        Conflicto conflicto =new Conflicto(nombre, fecha,"ACTIVO", paises);
        int opcion;
        do {

            System.out.println("\n========= MENU =========");
            System.out.println("1. Registrar evento");
            System.out.println("2. Listar eventos");
            System.out.println("3. Buscar evento");
            System.out.println("4. Actualizar descripcion");
            System.out.println("5. Mostrar estado conflicto");
            System.out.println("6. Mostrar conflicto completo");
            System.out.println("7. Salir");
            System.out.print("Opcion: ");
            opcion = tcl.nextInt();
            tcl.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Nombre evento: ");
                    String nomEvento = tcl.nextLine();
                    System.out.print("Tipo evento: ");
                    String tipo = tcl.nextLine();
                    System.out.print("Fecha evento: ");
                    String fechaEvento = tcl.nextLine();
                    System.out.print("Ubicacion: ");
                    String ubicacion = tcl.nextLine();
                    System.out.print("Descripcion: ");
                    String descripcion = tcl.nextLine();
                    System.out.print("Uso armas nucleares (true/false): ");
                    boolean nuclear = tcl.nextBoolean();
                    System.out.print("Porcentaje bajas: ");
                    double bajas = tcl.nextDouble();
                    System.out.print("Cantidad paises batalla: ");
                    int cantPaises = tcl.nextInt();
                    tcl.nextLine();
                    Evento evento = new Evento(nomEvento,tipo,fechaEvento,ubicacion,descripcion,nuclear,bajas,cantPaises);

                    conflicto.agregarEvento(evento);
                    System.out.println("\nEVENTO REGISTRADO");
                    break;

                case 2:
                    conflicto.listarEventos();
                    break;
                case 3:
                    System.out.print("Ingrese nombre evento buscar: ");
                    String buscar = tcl.nextLine();
                    conflicto.buscarEvento(buscar);
                    break;
                case 4:
                    System.out.print("Nombre evento actualizar: ");
                    String nombreActualizar = tcl.nextLine();
                    System.out.print("Nueva descripcion: ");
                    String nuevaDescripcion = tcl.nextLine();
                    conflicto.actualizarEvento(nombreActualizar,nuevaDescripcion);
                    break;

                case 5:
                    conflicto.mostrarEstado();
                    break;

                case 6:
                    System.out.println(conflicto);
                    break;

                case 7:
                    System.out.println("FIN PROGRAMA");
                    break;

                default:
                    System.out.println("Opcion incorrecta");
            }
        } while (opcion != 7);
    }
}
        

