
package Problema4_AppFiscalia;
import java.util.Scanner;
public class ProblemaFiscalia {
    public static void main(String[] args) {
             Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el nombre del caso:");
        String nombreCaso = sc.nextLine();

        System.out.println("Ingrese la fecha de inicio:");
        String fechaInicio = sc.nextLine();

        System.out.println("Ingrese los dias transcurridos:");
        int dias = sc.nextInt();
        sc.nextLine();

        System.out.println("Ingrese el detalle del caso:");
        String detalle = sc.nextLine();

        System.out.println("Ingrese el dano economico:");
        double danio = sc.nextDouble();

        System.out.println(
                "Ingrese la cantidad de personas:");
        int cantidad = sc.nextInt();
        sc.nextLine();

        CasoCorrupcion caso= new CasoCorrupcion(nombreCaso,fechaInicio,dias,detalle,danio,cantidad);

        for (int i = 0; i < cantidad; i++) {

            System.out.println(
                    "\nPERSONA " + (i + 1));

            System.out.println("Ingrese el nombre:");
            String nombre = sc.nextLine();

            System.out.println("Ingrese la edad:");
            int edad = sc.nextInt();
            sc.nextLine();

            System.out.println("Ingrese la ocupacion:");
            String ocupacion = sc.nextLine();

            System.out.println(
                    "Ingrese el nivel de implicacion:");
            String nivel = sc.nextLine();

            System.out.println(
                    "Ingrese sentencia en meses:");
            int sentencia = sc.nextInt();

            System.out.println(
                    "¿Colabora con la justicia? "
                    + "(true/false)");

            boolean colabora = sc.nextBoolean();
            sc.nextLine();
            PersonaImplicada persona = new PersonaImplicada( nombre,edad,ocupacion,nivel,sentencia,colabora);
            caso.agregarPersona(persona);
        }

        System.out.println("\n");
        System.out.println(caso.toString());
    }
    }

    

